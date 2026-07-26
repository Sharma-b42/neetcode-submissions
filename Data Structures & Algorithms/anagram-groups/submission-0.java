class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap= new HashMap<>();

        for(String str : strs){

            char[] chars= str.toCharArray();
            Arrays.sort(chars);
            String sortedString= new String(chars);

            hashMap.computeIfAbsent(sortedString, k-> new ArrayList<>()).add(str);

        }

        return new ArrayList<>(hashMap.values());
    }
}
