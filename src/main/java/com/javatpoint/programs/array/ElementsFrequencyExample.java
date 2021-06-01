package com.javatpoint.programs.array;

public class ElementsFrequencyExample {
	public static void main(String[] args) {
		int[] arr = { '1', '2', '3', '2', '1', '2', '3', '4' };
		int count = 1;
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			a = i;
			for (int j = 0; j < arr.length; j++) {
				if (j == i) {
					count++;
				}
			}
		}
	}

}
