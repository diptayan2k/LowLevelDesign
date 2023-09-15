package com.cost;

import com.cost.CostStrategy;

public class PassengerCarCostStrategy implements CostStrategy {
    @Override
    public int calculateCost() {
        return 20;
    }
}
