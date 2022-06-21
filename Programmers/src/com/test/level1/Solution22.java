package com.test.level1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

class Solution22 {
	public String solution(int a, int b) {
		return LocalDate.of(2016, a, b).getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
	}

	public static void main(String[] args) {

		Solution22 s3 = new Solution22();

		s3.solution(5, 24);
		System.out.println(6 % 7);
	}
}

//dababcdcd
//dababcdcd