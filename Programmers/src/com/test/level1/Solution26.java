package com.test.level1;

class Solution26 {
    public String solution(String s) {
        String answer = "";
        
        if(s.length()%2==0){
              answer = s.substring((s.length()/2)-1,(s.length()/2)+1);
        }else{
            answer = s.substring(s.length()/2,(s.length()/2)+1);
        }
        System.out.println(answer);
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

		Solution26 s3 = new Solution26();
	
		
		s3.solution("qwer");

	}
}

//dababcdcd
//dababcdcd