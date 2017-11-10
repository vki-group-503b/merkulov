package ru.nsu.hci.merkulov.lab2;

import java.util.Scanner;

public class lab2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();
        new NumRepository(array);
        System.out.println("Max: " + NumRepository.MaxNumber());
        System.out.println("Min: " + NumRepository.MinNumber());
        System.out.println("Average: " + NumRepository.AvgNumber());
        System.out.println("Median: "+ NumRepository.MedianOfArray());
        System.out.println("AverageGeometry: " + NumRepository.AvgGeomtr());
    }
}
