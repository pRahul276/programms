package com.javatpoint.programs.array;

import java.util.Arrays;

public class Array_1 {
      public static void main(String[] args) {
    	  int[] a = {1, 22, 44,33};
    	  int length = a.length;
    	  int[] b = new int[length];
    	  for(int i=0; i < length; i++) {
    		  b[i] = a[i];
    	  }
    	  System.out.println(Arrays.toString(b));
    	  System.out.print(Arrays.toString(a));
      }
}
