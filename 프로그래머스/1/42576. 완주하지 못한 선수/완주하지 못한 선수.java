import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> countMap = new HashMap<>();
        
        for (String name : participant) {
            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
        }
        
        for (String name : completion) {
            countMap.put(name, countMap.get(name) - 1);
        }
        
        for (Map.Entry<String, Integer> result : countMap.entrySet()) {
            if (result.getValue() > 0) {
                return result.getKey();
            }
        }
        
        return "";
    }
}