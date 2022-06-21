

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDistinctSort {
	public static int[] solution(String[] id_list, String[] report, int k) {

		Map<String, Integer> idIndex = new HashMap<>();
		Map<String, ArrayList<String>> reportedMap = new HashMap<String, ArrayList<String>>();
		int[] answer = new int[id_list.length];

		for (int i = 0; i < id_list.length; i++) {
			idIndex.put(id_list[i], i);
			reportedMap.put(id_list[i], new ArrayList<>());
		}

		List<String> list = Arrays.stream(report).distinct().sorted().collect(Collectors.toList());
		Arrays.stream(report).forEach(s -> System.out.println(s));
		Collections.sort(list);
		for (String re : list) {
			String[] temp = re.split(" ");
			reportedMap.get(temp[1]).add(temp[0]);
		}

		for (String name : id_list) {
			if (reportedMap.get(name).size() >= k) {
				for (String nm : reportedMap.get(name)) {
					answer[idIndex.get(nm)]++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;
		solution(id_list, report, k);
		// System.out.println(solution(id_list,report,k).toString());
	}
}
