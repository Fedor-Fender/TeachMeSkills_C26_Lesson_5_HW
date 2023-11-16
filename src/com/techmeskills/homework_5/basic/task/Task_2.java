package com.techmeskills.homework_5.basic.task;

import java.util.Arrays;

/**
 * Create application for drawing chess board via loop.
 * 	Create two-digit array String'ов 8х8. Using loop to set up number of array value
 * 	 B(Black) или W(White). It's result of executing program
 * 	W B W B W B W B
 * 	B W B W B W B W
 * 	W B W B W B W B
 * 	B W B W B W B W
 * 	W B W B W B W B
 * 	B W B W B W B W
 * 	W B W B W B W B
 * 	B W B W B W B W
 */
public class Task_2 {
    public static void main(String[] args) {
        //to set up size of array

        String[][] chBoard = new String[8][8];
        // going through each number of array

        for (int i = 0; i < chBoard.length; i++) {
            for (int j = 0; j < chBoard[0].length; j++) {
                if ((i+j)%2==0) {
                    chBoard[i][j] = "W"; //value White
                } else chBoard[i][j] = "B";//value Black
                System.out.print(chBoard[i][j]+" ");
            }
            System.out.println();
        }
    }
}
