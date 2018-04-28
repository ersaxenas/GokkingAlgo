package com.lrn.ch1;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BinarySearch1Test {
	private final BinarySearch1 testClass = new BinarySearch1();

	@Test
	public void test() {
		final List<Integer> listOfInts = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		assertTrue("Element '1' not found at the correct index", 0 == testClass.findElement(listOfInts, 1).orElse(-1));
		assertTrue("Element '52' not found at the correct index", 9 == testClass.findElement(listOfInts, 13).orElse(-1));
		assertTrue("Non-existant element '100' found ", !testClass.findElement(listOfInts, 100).isPresent());
	}

}
