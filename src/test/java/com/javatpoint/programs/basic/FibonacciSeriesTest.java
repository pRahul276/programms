package com.javatpoint.programs.basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciSeriesTest {

	@Test
	public void test() {
		FibonacciSeries fs = new FibonacciSeries();
		fs.run(5,5);
	}

}
