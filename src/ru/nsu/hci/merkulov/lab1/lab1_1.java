package ru.nsu.hci.merkulov.lab1;

public class lab1_1 {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else {
                if ((i % 3 != 0) && (i % 5 != 0)) {
                    System.out.println(i);
                }
                if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
            }
        }
    }
}

