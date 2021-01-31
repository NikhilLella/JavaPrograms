/**
 * 
 */
package com.test.lco;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Lella Multiplication program for the given number
 */
public class Day1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int number = sc.nextInt();
			multiplication(number);
		} catch (InputMismatchException e) {
			System.out.println(e + " Please enter a valid input");
		}

		
	}

	/**
	 * 
	 */
	private static void multiplication(int number) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(number * i);
		}

	}

}
