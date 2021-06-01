package com.javatpoint.programs.string;

public class String_1 {
	public static void main(String[] args) {
		String st = "Hello, world";
		int length = st.length();
		int count = 0;
		for (int i = 0; i < length; i++) {
			char c = st.charAt(i);
			if (c != ' ') {
				count++;
			}
		}
		System.out.print(count);
	}

}
