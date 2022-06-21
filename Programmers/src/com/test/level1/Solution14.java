package com.test.level1;

import java.util.Arrays;

class Solution14 {
	public int solution(int[] nums) {
		int answer = 0;
		int disCnt = (int)Arrays.stream(nums).distinct().count();
		return disCnt > (nums.length/2) ? (nums.length/2):disCnt;
	}

	public static void main(String[] args) {

		Solution14 s3 = new Solution14();

		int[] nums = { 3,3,3,2,2,2};
		System.out.println(s3.solution(nums));
		
	}
}
