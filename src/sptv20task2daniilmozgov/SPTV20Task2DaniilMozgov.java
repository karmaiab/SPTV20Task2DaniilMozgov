/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20task2daniilmozgov;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV20Task2DaniilMozgov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = scanner.nextInt();
        int ones = number%10;
        int tens = number/10%10;
        int hundr = number/100;
        int sum = ones+tens+hundr;
        System.out.println("The sum is of the number is: "+sum);
    }
    
}
