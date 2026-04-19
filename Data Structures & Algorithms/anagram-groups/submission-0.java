class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash = new HashMap<String, List<String>>();
        for(String str: strs) {
            String[] temp = str.split("");
            Arrays.sort(temp);
            String key = String.join("", temp);

            if(hash.containsKey(key)) {
                List<String> value = hash.get(key);
                value.add(str);
                hash.put(key, value);
            } else {
                List<String> value = new ArrayList<>();
                value.add(str);
                hash.put(key, value);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> h: hash.values()) {
            ans.add(h);
        }
        return ans;
    }
}
