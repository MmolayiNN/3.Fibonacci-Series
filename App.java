/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacciseries;
 import java.util.Scanner;
/**
 *
 * @author Hohm
 */
public class App {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scan.nextInt();
        
        // Print the Fibonacci series up to the given number of terms
        System.out.println("Fibonacci series up to " + n + " terms:");
        printFibonacciSeries(n);
        
        // Close the Scanner object
        scan.close();
    }
    
    // Method to print Fibonacci series up to n terms
    public static void printFibonacciSeries(int n) {
        int num1 = 0, num2 = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}

   
