package com.test.level1;

public class Solution5 {
	public int getDistinct(int curKey, int inputKey) {
		return Math.abs((curKey / 3) - (inputKey / 3)) + Math.abs((curKey % 3) - (inputKey % 3));
	}

	public String solution(int[] numbers, String hand) {
		String answer = "";

		int[] currKey = { 10, 12 };
		String defaultHand = "right".equals(hand) ? "R" : "L";
		
		int[] tNumber = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			tNumber[i] = numbers[i] == 0 ? 11 : numbers[i];
		}

		for (int i = 0; i < tNumber.length; i++) {
			System.out.print("L:" + currKey[0] +",R:"+currKey[1] +",input:"+tNumber[i] );
			if ((tNumber[i] % 3) == 1) {
				System.out.println("L");
				answer += "L";
				currKey[0] = tNumber[i];
			} else if ((tNumber[i] % 3) == 2) {
				System.out.println("B");
				int lDis = getDistinct(currKey[0]-1, tNumber[i]-1);
				int rDis = getDistinct(currKey[1]-1, tNumber[i]-1);
				System.out.println(lDis +","+rDis);
				if (lDis == rDis) {
					if("L".equals(defaultHand))
					{
						currKey[0] = tNumber[i];
						answer += "L";
					}else {
						currKey[1] = tNumber[i];
						answer += "R";
					}
				} else if (lDis < rDis) {
					currKey[0] = tNumber[i];
					answer += "L";
				} else {
					currKey[1] = tNumber[i];
					answer += "R";
				}
			} else {
				System.out.println("R");
				answer += "R";
				currKey[1] = tNumber[i];
			}
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Solution5 s3 = new Solution5();
		int[] input = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
		String hand = "left";
		s3.solution(input, hand);
	}
}
