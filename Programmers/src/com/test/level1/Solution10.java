package com.test.level1;

import java.util.HashMap;
import java.util.Map;

public class Solution10 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> pMap = new HashMap<String, Integer>();
		
		for(String p : participant) {
			pMap.put(p, pMap.getOrDefault(p, 0)+1);
		}
		for(String c : completion) {
			pMap.put(c, pMap.getOrDefault(c, 0)-1);
		}
		
		for(String key : pMap.keySet()) {
			if( pMap.get(key) != 0) {
				answer = key;
				return answer;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution10 s3 = new Solution10();
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki" };
		s3.solution(participant, completion);
	}
}
