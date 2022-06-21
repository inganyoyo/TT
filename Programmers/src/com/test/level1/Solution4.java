package com.test.level1;

public class Solution4 {
	public int solution(String s) {

		String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		for (int i = 0; i < arr.length; i++) {
			if (s.contains(arr[i])) {
				s = s.replaceAll(arr[i], Integer.toString(i));
			}
		}
		System.out.println(s);
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		Solution4 s3 = new Solution4();
		String input = "one4seveneight";
//		id = "";
		s3.solution(input);
	}
}
