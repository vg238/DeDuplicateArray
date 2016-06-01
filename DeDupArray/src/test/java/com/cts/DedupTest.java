package com.cts;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

public class DedupTest {

	private int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,
									3,20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,
								   19,13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
	private int[] expectedIntegers = {1, 2, 34, 25, 45, 3, 26, 85, 4, 86, 43, 10000, 11, 16, 19, 18, 9,
																20, 17, 8, 15, 6, 5, 10, 14, 12, 13, 7};

	static DeDup deDup;
	
	@BeforeClass
	public static void initialize(){
		deDup = new DeDup();
	}
	
	@Test
	public void test_deDupsUsingArrayList() {
		assertArrayEquals(expectedIntegers, deDup.deDupsUsingArrayList(randomIntegers));		
	}
	
	@Test
	public void test_deDupUsingLinkedHashSet() {
		assertArrayEquals(expectedIntegers, deDup.deDupUsingLinkedHashSet(randomIntegers));	
	}
	
	//Result from deDup.removeDuplicates(randomIntegers) is sorted & deduplicated array. To compare the arrays, we are sorting extectedIntergers first.
	@Test
	public void test_deDupByLoopingArray() {
		Arrays.sort(expectedIntegers);
		assertArrayEquals(expectedIntegers,deDup.deDupByLoopingArray(randomIntegers));
		
		
	}

}
