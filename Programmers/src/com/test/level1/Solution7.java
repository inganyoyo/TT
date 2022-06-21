package com.test.level1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution7 {

    public int solution(int[] numbers) {        
        return IntStream.range(0, 10).sum()-Arrays.stream(numbers).sum();
//      	IntStream nS= Arrays.stream(new int[]{1, 2, 3,4,5,6,7,8,9});
//    	IntStream iS= Arrays.stream(numbers);
//    	return 45-iS.filter(i -> nS.anyMatch(n-> i==n )).sum();
    }

	public static void main(String[] args) {
		Solution7 s3 = new Solution7();
		int[] input = { 1,2,3,4,6,7,8,0};
		s3.solution(input);
	}
}
