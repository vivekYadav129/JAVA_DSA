import java.util.*;

class GroupAnagram {

    static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] count = new int[26];

            
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            
            String key = Arrays.toString(count);

            
            map.putIfAbsent(key, new ArrayList<>());

        
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {
            "eat", "tea", "tan", "ate", "nat", "bat"
        };

        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);
    }
}