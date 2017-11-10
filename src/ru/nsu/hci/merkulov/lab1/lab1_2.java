package ru.nsu.hci.merkulov.lab1;
import java.util.Scanner;

public class lab1_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextByte();
        String answer = sc.nextLine();
        Prime(num,answer);
    }
    public static void Prime(int num,String answer){
        boolean check = false;
        for(int i = 2;i < num;i++) {
            if (num % i == 0)
                check = true;
            if (check){
                System.out.println("Number isn't prime");
                break;
            }
        }
        if (!check)
            System.out.println("Number is prime");

        System.out.println("Do you want continue programm? (Y/N)");
        switch (answer){
            case "Y": Prime(num, answer);

            case "N": System.out.println("Bye!");

        }
    }
}