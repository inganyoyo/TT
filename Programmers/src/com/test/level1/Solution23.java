package com.test.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

class Solution23 {
    public ArrayList<Integer>  solution(int[] numbers) {
      
        Vector<Integer> vector = new Vector<>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(arrayList.contains(numbers[i]+numbers[j])){
					continue;
				}
				arrayList.add(numbers[i]+numbers[j]);
				
			}
		}
        
        Collections.sort(arrayList);
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
        	answer[i] = arrayList.get(i);
		}
        
 
        return arrayList;
    }

	public static void main(String[] args) {

		Solution23 s3 = new Solution23();
		int[] numbsers = {2,1,3,4,1};
		
		
		s3.solution(numbsers);

	}
}

//dababcdcd
//dababcdcd