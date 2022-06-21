package com.test.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;

class Solution12 {
	public int[] solution(int[] answers) {
		
		int[][] students = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
		int[][] studentsInput = new int[3][answers.length];
		Map<String, Integer> reMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < studentsInput.length; i++) {
			for (int j = 0; j < studentsInput[i].length; j++) {
				studentsInput[i][j] = students[i][(j%students[i].length)];
			}
		}
		
		for (int i = 0; i < answers.length; i++) {
			for (int j = 0; j < studentsInput.length; j++) {
				if (answers[i] == studentsInput[j][i])
				{
					reMap.put(String.valueOf(j+1), reMap.getOrDefault(String.valueOf(j+1), 0)+1);
				}
			}
		}
		int[] p = new int[3];
		p[0] =reMap.getOrDefault(String.valueOf(1), 0);
		p[1] =reMap.getOrDefault(String.valueOf(2), 0);
		p[2] =reMap.getOrDefault(String.valueOf(3), 0);
		
		
		if ( reMap.size() ==0 ) {
			return new int[]{};
		}
		OptionalInt opMax = Arrays.stream(p).max();
		int max = opMax.getAsInt();
		
		 ArrayList<Integer> list = new ArrayList<>();

		 for (int i = 0; i < p.length; i++) {
			if(p[i]==max) {
				list.add(i+1);
			}
		}
		return list.stream().mapToInt(i->i.intValue()).toArray();
	}

	public static void main(String[] args) {
		
		Solution12 s3 = new Solution12();
		int[] answers = { 1,3,2,4,2 };

		s3.solution(answers);
	}
}
