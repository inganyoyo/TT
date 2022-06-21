

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ArrayListToArray {

    
    public String[] solution(String[] record) {
        String[] answer = {};
        Map<String, String> nmMap = new HashMap<String, String>();
        List<String> answerList = new ArrayList<String>();
        String[] key = new String[3]; 
        for (int i = 0; i < record.length; i++) {
        	key = record[i].split(" ");
        	if("Leave".equals(key[0])) {
        		continue;
        	}
        	nmMap.put(key[1], key[2]);
		}
        
        for (int i = 0; i < record.length; i++) {
        	
        	key = record[i].split(" ");
        	String nm = nmMap.get(key[1]);
        	String txt = "";
        	if("Leave".equals(key[0])) {
        		txt ="님이 나갔습니다.";
        	}else if("Enter".equals(key[0])) {
        		txt ="님이 들어왔습니다.";
        	}else if("Change".equals(key[0])) {
        		continue;
        	}
        	answerList.add(nm+txt);
		}
      
        
        return answerList.toArray(new String[answerList.size()]);
    }

	public static void main(String[] args) {

		ArrayListToArray s3 = new ArrayListToArray();
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		
		s3.solution(record);

	}
}

//dababcdcd
//dababcdcd