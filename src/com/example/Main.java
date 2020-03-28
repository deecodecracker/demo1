package com.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start of program");
        int sum = add(5,8);

        System.out.println("The sum is : " + sum);
        System.out.println("End of program");
    }

    private static int add(int a,int b) {
        return a+b;
    }
}
