package com.test.level1;

class BitCal {
	  public String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] result = new String[n];
	        for (int i = 0; i < n; i++) {
	            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
	        }

	        for (int i = 0; i < n; i++) {
	            result[i] = String.format("%" + n + "s", result[i]);
	            result[i] = result[i].replaceAll("1", "#");
	            result[i] = result[i].replaceAll("0", " ");
	        }

	        return result;
	    }

	public static void main(String[] args) {

		BitCal s3 = new BitCal();
	int[] arr1 = {46, 33, 33 ,22, 31, 50};
	int[] arr2 = {27 ,56, 19, 14, 14, 10};
	int n =6;
	
	
		
		s3.solution(n,arr1,arr2);

	}
}

//dababcdcd
//dababcdcd