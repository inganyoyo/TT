package com.test.level1;

import java.util.stream.IntStream;

public class Solution9 {
	public int solution(int[] nums) {
		//에라토스테네스의 체
		boolean[] check = new boolean[10000 + 1]; // true : 비소수 , false : 소수
		
		int cnt = 0;

		check[0] = check[1] = true;

		for (int i = 2; i*i <= 10000; i++) {
			if (!check[i])
			{
				for (int j = i*i; j <= 10000; j+=i) {
					check[i] = true;
				}
			}
		}
		


		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int num = nums[i] + nums[j] + nums[k];
					System.out.println(num + "" + check[num]);
					if (!check[num]) {
						cnt++;
					}
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Solution9 s3 = new Solution9();
		int[] nums = { 1, 2, 3, 4 };

		s3.solution(nums);
	}
}
