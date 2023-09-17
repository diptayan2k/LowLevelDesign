package tictactoe.services;

import tictactoe.models.Cell;
import tictactoe.models.Grid;
import tictactoe.models.Player;
import tictactoe.models.PlayingPiece;
import tictactoe.providers.GridProvider;
import tictactoe.providers.PlayerProviders;
import tictactoe.providers.PlayingPieceProvider;

import java.util.*;
import java.util.stream.Collectors;

public class Game {

    private GridProvider gridProvider;
    private PlayerProviders playerProviders;

    public Game(GridProvider gridProvider, PlayerProviders playerProviders) {
        this.gridProvider = gridProvider;
        this.playerProviders = playerProviders;
    }

    public void startGame(){

        Deque<Player> players = new LinkedList<>();
        for(Player player : playerProviders.getPlayers()){
            players.addLast(player);
        }

        Player winner = null;

        while (winner == null){
            Player player = players.removeFirst();
            if(!turn(player)){
                players.addFirst(player);
            }else players.addLast(player);
            winner = getWinner(gridProvider.getGrid());
            printGrid(gridProvider.getGrid(), gridProvider.getGrid().getSide());
        }

        System.out.printf("Winner is : %d", winner.getId());


    }

    public boolean turn(Player player){

        System.out.printf("Player %d, enter the row and column :%n", player.getId());
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> position = Arrays.stream(input.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        return gridProvider.assignPlayingPiece(position.get(0),position.get(1),player.getAssignedPiece());
    }

    public void printGrid(Grid grid, int side){

        Cell[][] cells = grid.getCells();
        for(int i = 0; i< side; i++){
            for(int j = 0; j<side; j++){
                System.out.printf("| %s |",Objects.nonNull(cells[i][j].getPiece()) ? cells[i][j].getPiece().toString() : " " );
            }
            System.out.println();
        }
    }

    public Player getWinner(Grid grid){

        if(checkRows(grid, grid.getSide())!=null) {
            return getPlayerFromPiece(checkRows(grid, grid.getSide()));
        }
        else if(checkColumns(grid, grid.getSide())!=null){
            return getPlayerFromPiece(checkColumns(grid, grid.getSide()));
        }
        else if(checkDiagonal(grid, grid.getSide())!=null){
            return getPlayerFromPiece(checkDiagonal(grid, grid.getSide()));
        }
        else if(checkReverseDiagonal(grid, grid.getSide())!=null){
            return getPlayerFromPiece(checkReverseDiagonal(grid, grid.getSide()));
        }

        return null;

    }

    public Player getPlayerFromPiece(PlayingPiece piece){
        List<Player> players = playerProviders.getPlayers();

        for(Player player: players){
            if(player.getAssignedPiece() == piece)
                return player;
        }
        System.out.println("Internal error!!");
        return null;
    }

    public PlayingPiece checkRows(Grid grid, int side){
        Cell[][] cells = grid.getCells();
        for(int i = 0; i< side; i++){
            int count = 0;
            for(int j = 0; j<side; j++){
                if(cells[i][j].getPiece()==cells[i][0].getPiece()){
                    count++;
                }
            }
            if(count == side) return cells[i][0].getPiece();
        }
        return null;
    }

    public PlayingPiece checkColumns(Grid grid, int side){
        Cell[][] cells = grid.getCells();
        for(int i = 0; i< side; i++){
            int count = 0;
            for(int j = 0; j<side; j++){
                if(cells[j][i].getPiece()==cells[0][i].getPiece()){
                    count++;
                }
            }
            if(count == side) return cells[0][i].getPiece();
        }
        return  null;
    }

    public PlayingPiece checkDiagonal(Grid grid, int side){
        Cell[][] cells = grid.getCells();
        for(int i = 1; i<side; i++)
        {
            if(cells[i][i].getPiece()!=cells[i-1][i-1].getPiece())
                return null;
        }
        return cells[0][0].getPiece();
    }

    public PlayingPiece checkReverseDiagonal(Grid grid, int side){
        Cell[][] cells = grid.getCells();
        for(int i = 0, j = side-1; i<side; i++, j--)
        {
            if(cells[i][j].getPiece()!=cells[0][side-1].getPiece())
                return null;
        }
        return cells[0][side-1].getPiece();
    }


}
