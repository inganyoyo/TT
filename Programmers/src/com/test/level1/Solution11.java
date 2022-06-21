package com.test.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution11 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<Integer>();;
        for (int row = 0; row < commands.length; row++) {
        	 list.clear();
        	 int i = commands[row][0]; //i 
             int j = commands[row][1]; //j
             int k = commands[row][2]; //k 
//             System.out.println(i +" "+ j +" "+k);
        	for ( ; i <= j; i++) {
        		
        		list.add(array[i-1]);
        		
        	}
        	Collections.sort(list);

        	list.sort(Comparator.naturalOrder());
        	
        	answer[row]=list.get(k-1);

        	
		}
        return answer;
    }

	public static void main(String[] args) {
		Solution11 s3 = new Solution11();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands= {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		s3.solution(array, commands);
	}
}
