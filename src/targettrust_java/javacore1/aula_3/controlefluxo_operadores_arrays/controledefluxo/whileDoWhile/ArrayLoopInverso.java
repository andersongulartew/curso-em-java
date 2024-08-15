package com.targettrust.loop.whileDoWhile;

public class ArrayLoopInverso {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = array.length - 1;
        while (i >= 0) {
            System.out.println(array[i]);
            i--;
        }
    }
}
