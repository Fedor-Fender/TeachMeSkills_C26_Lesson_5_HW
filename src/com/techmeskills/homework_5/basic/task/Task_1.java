package com.techmeskills.homework_5.basic.task;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create three-dimensional array of integers number
 * Using loop go through all array and to increase each element of array for number is given from console
 */
public class Task_1 {
    public static void main(String[] args) {

        // Create array which has size is [2][2][3]
        int[][][] array = {

                {{18, 25}, {45, 90,}}, {{25, 125}, {0, 11}}, {{25, 17}, {1, 7}}

        };
        System.out.println("Input added number");
        Scanner sc = new Scanner(System.in);
        int adArray= sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += adArray;
                    System.out.print(array[i][j][k]+ " ");
                }
            }
        }
    }
}