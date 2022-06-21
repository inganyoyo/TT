package com.test.level1;

import java.util.Arrays;

public class Solution2 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int match = (int)Arrays.stream(lottos).filter(f -> Arrays.stream(win_nums).anyMatch(w -> w == f)).count();
        int zero = (int)Arrays.stream(lottos).filter(f -> f == 0).count();

       
        int[] returnArray = new int[2];
        returnArray[0] = (int) (7 - (match + zero));
        returnArray[0] = returnArray[0] > 6 ? 6 : returnArray[0];
        returnArray[1] = (int) (7 - (match));
        returnArray[1] = returnArray[1] > 6 ? 6 : returnArray[1];

        return returnArray;
    }
	public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        int[] lottos = {1, 2, 3, 4, 5, 6};
        int[] win_nums = {7, 8, 9, 10, 11, 12};
        s2.solution(lottos, win_nums);
	}
}
