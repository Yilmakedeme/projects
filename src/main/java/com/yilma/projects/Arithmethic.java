package com.yilma.projects;

public class Arithmethic implements DifferenceOfTwoNumbers, SumOfTwoNumbers{

    Arithmethic(Double a, Double b) {

    }

    @Override
    public Double getDifference(Double a, Double b) {
        return b - a;
    }

    @Override
    public Double getSum(Double a, Double b) {
        return a + b;
    }
}
