class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!= t.length())
            return false;

        HashMap<Character, Integer> hashMap= new HashMap<>();

        for(char c : s.toCharArray())
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);

        for(char c : t.toCharArray())
            hashMap.put(c, hashMap.getOrDefault(c, 0)-1);

        for(int count : hashMap.values()){
            if(count!=0)
                return false;
        }

        return true;        
    }
}
