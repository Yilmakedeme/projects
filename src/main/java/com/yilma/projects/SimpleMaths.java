package com.yilma.projects;

public class SimpleMaths {

    public static void main(String[] args) {
        double a = 5;
        double b = 8;

        Arithmethic maths = new Arithmethic(a, b);

        Double sum = maths.getSum(a, b);
        Double difference = maths.getDifference(a, b);

        System.out.print("The sum of " + a + " and " + b + " is " + sum);
        System.out.println();
        System.out.print("The Difference of " + b + " and " + a + " is " + difference);
    }

}
