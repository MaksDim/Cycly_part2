package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            for (int j = 200; j <= 300; j++) {
                if (i * i == j) {
                    System.out.println(i);
                }
            }
        }
    }
}

