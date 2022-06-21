package com.test.level1;

class Solution25 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String binaryString ="";
        String binary = "";
        
        String[][] tempArr1 = new String[n][n];
        String[][] tempArr2 = new String[n][n];
        
        int i=0;
        for(int number: arr1){
        	binaryString = Integer.toBinaryString(number);
        	
            binary = lpad(binaryString,n);
            tempArr1[i] =binary.split("");
            i++;
        }
        i = 0;
        for(int number: arr2){
        	binaryString = Integer.toBinaryString(number);
            binary = lpad(binaryString,n);
            tempArr2[i] =binary.split("");
            i++;
        }
        String result ="";
        for (int j = 0; j < tempArr2.length; j++) {
        	 result ="";
			for (int j2 = 0; j2 < tempArr2.length; j2++) {
				if("1".equals(tempArr2[j][j2]) || "1".equals(tempArr1[j][j2])) {
					result = result+"#";
					
				}else {
					result = result+" ";
				}
			
			}
			answer[j]=result;
			System.out.println(result);
			
			
		}
        
        return answer;
    }
    public static String lpad(String str, int size){
    	
    	String t = str;
        String zero="";
        for(int i =0; i< (size - str.length()); i++){
            
            zero ="0"+zero;
        }
        
        return zero+t;
    }

	public static void main(String[] args) {

		Solution25 s3 = new Solution25();
	int[] arr1 = {46, 33, 33 ,22, 31, 50};
	int[] arr2 = {27 ,56, 19, 14, 14, 10};
	int n =6;
	
	
		
		s3.solution(n,arr1,arr2);

	}
}

//dababcdcd
//dababcdcd