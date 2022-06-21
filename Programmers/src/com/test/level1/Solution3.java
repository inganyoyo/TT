package com.test.level1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Solution3 {
	public String solution(String new_id) {
		String answer = "";
		answer = new_id.toLowerCase();
		answer = answer.replaceAll("[^a-z0-9-_.]", "");
		//System.out.println(answer);
		answer = answer.replaceAll("[.]{2,}", ".");
		//System.out.println(answer);
		answer = answer.replaceAll("^[.]", "");
		//System.out.println(answer);
		answer = answer.replaceAll("^[.]|[.]$", "");
		//System.out.println(answer);
		if ("".equals(answer)) {
			answer = "a";
		}

		if (answer.length() > 15) {
			answer = answer.substring(0, 15).replaceAll("[.]$", "");
		}
		

		if (answer.length() <= 2) {
			String temp = answer.substring(answer.length() - 1, answer.length() );
			while (answer.length() < 3)
			{
				answer += temp;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution3 s3 = new Solution3();
		String id ="z-+.^.";
//		id = "";
		s3.solution(id);
	}
}
//97
//122

//...bat..y.abcdefghijklm
//...bat..y.abcdefghijklm

//baty.abcdefghijklm
//