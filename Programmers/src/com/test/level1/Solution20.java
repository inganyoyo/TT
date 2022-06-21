package com.test.level1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution20 {

    
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        d = IntStream.of(d).sorted().toArray();
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
		
        	sum += d[i];
        	
        	if(sum>budget) {
				break;
			}
			answer++;
		}
        
        return answer;
    }

	public static void main(String[] args) {

		Solution20 s3 = new Solution20();
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		s3.solution(d, budget);

	}
}

//dababcdcd
//dababcdcd