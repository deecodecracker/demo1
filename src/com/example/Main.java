package com.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start of program");
        int sum = add(5,8);
        double difference = difference(80d,50d);
        System.out.println("The sum is : " + sum);
        System.out.println("The difference is : " + difference);
        System.out.println("End of program");
    }

    private static double difference(double a, double b) {
        return a-b;
    }

    private static int add(int a,int b) {
        return a+b;
    }
}
