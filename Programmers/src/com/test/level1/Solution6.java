package com.test.level1;

import java.util.Arrays;
import java.util.Stack;

public class Solution6 {

	public int solution(int[][] board, int[] moves) {
//		for (int k = 0; k < board.length; k++) {
//			for (int k2 = 0; k2 < board.length; k2++) {
//				System.out.print(board[k][k2] +",");
//			}
//			System.out.println();
//		}
//		System.out.println("--------------");
		
		int answer = 0;
		Stack<String> stack = new Stack<>();
		String temp = "";
		String lastStack = "";
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board[0].length ; j++) {
				
				if (board[j][moves[i] - 1] == 0) {
					continue;
				}

				temp = String.valueOf(board[j][moves[i]- 1 ]);
				
				board[j][moves[i]- 1] = 0;
				if (stack.isEmpty()) {
					lastStack = "";
				} else {
					lastStack = stack.peek();
				}

				if (lastStack.equals(temp)) {
					stack.pop();
					answer = answer + 2;
				} else {
					stack.push(temp);
				}

				break;
			   
			}
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Solution6 s3 = new Solution6();
		int[][] board = { { 0, 0, 0, 0, 0 },
						  { 0, 0, 1, 0, 3 }, 
						  { 0, 2, 5, 0, 1 }, 
						  { 4, 2, 4, 4, 2 },
						  { 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4};
		s3.solution(board, moves);
	}
}
