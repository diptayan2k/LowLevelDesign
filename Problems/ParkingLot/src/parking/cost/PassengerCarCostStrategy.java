package parking.cost;

public class PassengerCarCostStrategy implements CostStrategy {
    @Override
    public int calculateCost() {
        return 20;
    }
}
