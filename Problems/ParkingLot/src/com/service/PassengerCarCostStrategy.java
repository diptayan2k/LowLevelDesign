package com.service;

public class PassengerCarCostStrategy implements CostStrategy{
    @Override
    public int calculateCost() {
        return 20;
    }
}