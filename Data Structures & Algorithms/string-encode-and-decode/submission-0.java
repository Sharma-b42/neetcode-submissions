class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();

        for(String s : strs){
            str.append(s.length()).append("#").append(s);
        }

        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            
            int hashIndex = str.indexOf('#', i);
            
            
            int length = Integer.parseInt(str.substring(i, hashIndex));
            
           
            int start = hashIndex + 1;
            int end = start + length;
            decoded.add(str.substring(start, end));
         
            i = end;
        }

        return decoded;
    }
}
