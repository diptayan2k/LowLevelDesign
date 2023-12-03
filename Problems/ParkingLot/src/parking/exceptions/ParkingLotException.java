package parking.exceptions;

public class ParkingLotException extends RuntimeException {

    private ParkingLotErrors error;
    private  String message;

    public ParkingLotException(ParkingLotErrors parkingLotError, String message){
        super(message);
        this.error = parkingLotError;
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public ParkingLotErrors getError(){
        return error;
    }






}
