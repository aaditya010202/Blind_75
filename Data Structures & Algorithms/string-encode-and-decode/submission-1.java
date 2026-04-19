class Solution {

    public String encode(List<String> strs) {
        String encode = "";
        for(String str: strs) {
            Integer length = str.length();
            encode = encode + length + "#" + str;
        }
        return encode;
    }

    public List<String> decode(String str) {
        List<String> decode = new ArrayList<>();
        Integer i = 0;
        while(i<str.length()) {
            String number = "";
            while(str.charAt(i)!='#') {
                number += str.charAt(i);
                i++;
            }
            Integer size = Integer.valueOf(number);
            System.out.println(size);
            System.out.println(str.substring(i+1, i+size+1));
            decode.add(str.substring(i+1, i+size+1));
            i = i+size+1;
        }
        return decode;
    }
}
