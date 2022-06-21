package com.test.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

class Solution24 {
	 public int solution(int[][] sizes) {
	        int answer = 0;
	        int max_v=0;
	        int max_h=0;
	        for(int i=0;i<sizes.length;i++){
	            int v=Math.max(sizes[i][0],sizes[i][1]);
	            int h=Math.min(sizes[i][0],sizes[i][1]);
	            max_v=Math.max(max_v,v);
	            max_h=Math.max(max_h,h);
	        }
	        System.out.println(answer=max_v*max_h);
	        return answer=max_v*max_h;
	    }

	public static void main(String[] args) {

		Solution24 s3 = new Solution24();
		int[][] size= {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		
		s3.solution(size);

	}
}

//dababcdcd
//dababcdcd