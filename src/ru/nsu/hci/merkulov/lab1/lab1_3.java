package ru.nsu.hci.merkulov.lab1;

import java.util.Scanner;
import java.lang.String;


public class lab1_3 {
    public static void main (String[] args) {
        Check();
    }
    public static void Check () {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sequence");
        String sequence = sc.nextLine();

        for (int i = 0; i < sequence.length(); i++) { // Подсчёт скобочек в строке
            switch (sequence.charAt(i)) {
                case ')': {
                    counter--;
                    break;
                }
                case '(': {
                    counter++;
                    break;
                }
            }
            if (counter < 0) {
                System.out.println("Sequence isn't right");
                break;
            }
        }
        if (counter == 0)
            System.out.println("Sequence is right");
        if (counter > 0)
            System.out.println("Sequence isn't right");

        System.out.println("Do you want continue programm? (Y/N)");
        String answer = sc.nextLine();
        switch (answer){
            case "Y": Check();

            case "N": System.out.println("Bye!");

        }
    }
}
