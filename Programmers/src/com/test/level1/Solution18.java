package com.test.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution18 {
	public int divCnt (int N) {
		

		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				count++;
			}
			
		}
		
		if(count%2!=0) {
			N = (-1)*N;
		}
		
		return N;
	}
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
        	answer+=divCnt(i);
		}
        
        System.out.println(answer);
        return answer;
    }

	public static void main(String[] args) {

		Solution18 s3 = new Solution18();
		int left = 13;
		int right = 17;
		s3.solution(left, right);

	}
}

//dababcdcd
//dababcdcd