package com.test.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution16 {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		int[] stagesCnt = new int[N + 1];

		int playerCnt = stages.length;
		Map<Integer, Double> ratioMap = new HashMap<Integer, Double>();
		// System.out.println(playerCnt);
		for (int i = 0; i < stages.length; i++) {
			stagesCnt[stages[i] - 1] = stagesCnt[stages[i] - 1] + 1;
		}

		int stagePlayerSum = 0;
		for (int i = 0; i < N; i++) {
			int bumja = stagesCnt[i];
			int bunmo = playerCnt - stagePlayerSum;
			double ratio = bunmo == 0 ? (double) 0 : ((double) bumja / (double) bunmo);

			ratioMap.put(i + 1, ratio);

			stagePlayerSum += stagesCnt[i];
		}
		List<Integer> list = new ArrayList<Integer>(ratioMap.keySet());
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return ratioMap.get(o2).compareTo(ratioMap.get(o1));
			}
		});

		for (int i = 0; i < N; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {

		Solution16 s3 = new Solution16();
		int n = 8;
		int[] stages = { 1, 2, 3, 4, 5, 6, 7 };
		s3.solution(n, stages);

	}
}
