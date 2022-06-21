package com.test.temp;

import java.util.Arrays;
import java.util.stream.Stream;

public class SortingTest {
	public static void main(String[] args) {
		String str="K1KA5CB7";
		String aString ="";
		String nString = "";
		nString = str.replaceAll("[a-zA-Z]", "");
		
		char[] aa=str.replaceAll("[0-9]", "").toCharArray();
		Arrays.sort(aa);
		int num = 0;
		for (int i = 0; i < nString.length(); i++) {
			num += Integer.parseInt(nString.substring(i, i+1));
		}
		System.out.println(String.copyValueOf(aa)+num);
		
	}
}
