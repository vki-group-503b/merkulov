package ru.nsu.hci.merkulov.lab2;

import java.util.Arrays;

public class NumRepository {
    static int[] array;
    NumRepository(int[] array){
        this.array = array;
    }

    public static int MaxNumber() {
        int Max=array[0];
        for (int i: array)
            Max = Math.max(i,Max);
        return Max;
    }

    public static int MinNumber(){
        int Min=array[0];
        for (int i: array)
            Min = Math.min(i,Min);
        return Min;
    }

    public static double AvgNumber(){
        int sum=0;
        for (int i: array)
            sum += i;
        return sum / array.length;
    }

    public static double MedianOfArray(){
        Arrays.sort(array);
        if ((double) array.length % 2.0 == 0.0)
            return (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
        else
            return array[array.length / 2];
    }

    public static double AvgGeomtr() {
        double sum = 1;
        for (int i: array)
            sum *= i;

        return Math.pow(sum,1.0/array.length);
    }
}