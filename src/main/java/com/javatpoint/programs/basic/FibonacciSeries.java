package com.javatpoint.programs.basic;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.print("Fibonacci Series: ");
		System.out.print(" " + a + " " + b);
		int c = 0;
		for (int i = 1; i < 15; i++) {		
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}
}
