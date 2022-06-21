package com.test.level1;

class Solution19 {

    
    public int solution(int n) {
        int answer = 0;
        String r = "";
        StringBuffer sb = new StringBuffer(Integer.toString(n,3));
        r = sb.reverse().toString();
        answer = Integer.parseInt(r,3);
        
        
        return answer;
    }

	public static void main(String[] args) {

		Solution19 s3 = new Solution19();
		int n = 45;
		
		s3.solution(n);

	}
}

//dababcdcd
//dababcdcd