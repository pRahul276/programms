package com.javatpoint.programs.matrix;

import java.util.Arrays;

public class Matrices_1 {
	public static void main(String[] args) {
		int[][] m1 = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int[][] m2 = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

		int[][] ans = new int[3][3];
		int len = m1.length;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				ans[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				System.out.print(ans[i][j] + " ");
			}System.out.println(" ");
		}
//		

	}

}
