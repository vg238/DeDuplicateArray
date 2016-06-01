package com.cts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.google.common.primitives.Ints;

public class DeDup {

	public int[] deDupsUsingArrayList(int[] orgArray) {
		List<Integer> deDupedList = new ArrayList<Integer>();
		for (int i : orgArray) {
			if (!deDupedList.contains(i)) {
				deDupedList.add(i);
			}
		}
		return Ints.toArray(deDupedList);
	}

	public int[] deDupByLoopingArray(int[] orgArray) {

		if (orgArray.length < 2)
			return orgArray;

		Arrays.sort(orgArray);

		int j = 0, i = 1;
		while (i < orgArray.length) {
			if (orgArray[i] == orgArray[j]) {
				i++;
			} else {
				orgArray[++j] = orgArray[i++];
			}
		}
		int[] resultArray = Arrays.copyOf(orgArray, j + 1);

		return resultArray;
	}

	// using LinkedHashSet to preserve the ordering
	public int[] deDupUsingLinkedHashSet(int[] ints) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < ints.length; i++) {
			set.add(ints[i]);
		}

		return Ints.toArray(set);
	}

	public static void main(String[] args) {
		int[] r = { 1, 2, 34, 34, 25, 1, 45, 3, 26 };
		new DeDup().deDupByLoopingArray(r);
	}
}
