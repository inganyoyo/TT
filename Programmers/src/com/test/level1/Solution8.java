package com.test.level1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution8 {

    public int solution(int[] absolutes, boolean[] signs) {
        
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
			if(signs[i]) {
				answer += absolutes[i];
			}else {
				answer -= absolutes[i];
			}
		}
        return answer;
    }

	public static void main(String[] args) {
		Solution8 s3 = new Solution8();
		int[] absolutes= {4,7,12};
		boolean[] signs = {true,false,true};
		s3.solution(absolutes,signs);
	}
}
