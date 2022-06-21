package com.test.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution17 {
	public int solution(String s) {
		if (s.length() == 1)
			return 1;

		int answer = 1001;
		for (int length = s.length() / 2; length > 0; length--) {
			String current, next = "", result = "";
			int repeat = 1;
			for (int count = 0; count <= s.length() / length; count++) {
				current = next;
				int start = count * length;
				int end = Math.min(length * (count + 1), s.length());
				next = s.substring(start, end);

				if (current.equals(next)) {
					repeat++;
				} else {
					result += (getRepeatCount(repeat) + current);
					repeat = 1;
				}
			}
			result += (getRepeatCount(repeat) + next);
			answer = Math.min(answer, result.length());
		}

		return answer;
	}

	private String getRepeatCount(int hit) {
		return hit > 1 ? String.valueOf(hit) : "";
	}

	public static void main(String[] args) {

		Solution17 s3 = new Solution17();
		String s = "ababcdcdababcdcd";
		s3.solution(s);

	}
}

//dababcdcd
//dababcdcd