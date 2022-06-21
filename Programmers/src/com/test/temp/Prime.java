package com.test.temp;

import java.util.Arrays;

public class Prime {
	public static void main(String[] args) {
		// 에라토스테네스의 체
		int N = 10;
		boolean[] primeArrays = new boolean[N+1];
		primeArrays[0] = primeArrays[1] = true;
		
		for (int i = 2; i < Math.sqrt(N+1); i++) {
			if(!primeArrays[i])
			{
				for (int j = i*i; j < N+1; j+=i) {
					primeArrays[j] = true;
				}
			}
		}

		System.out.println(Arrays.toString(primeArrays));
	}
}
