package com.javatpoint.programs.number;

import java.util.Scanner;

public class ReversNumberExample {
	public static void main(String[] args) {
		
		System.out.println("Enter number :" );
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int reverse;
	
		if(number != 0) {
			while (number != 0) {
				reverse = number % 10;
				number = number / 10;
				System.out.print(reverse);
			}
		}
	}
}
