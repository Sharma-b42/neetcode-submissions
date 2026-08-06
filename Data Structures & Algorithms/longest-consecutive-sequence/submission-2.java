class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums==null || nums.length==0){
            return 0;
        }
        
        Set<Integer> hashset = new HashSet<>();
        for(int num : nums){
            hashset.add(num);
        }

        
        int max_length = 1;

        for(int num : hashset){
            if(!hashset.contains(num-1)){
                int length = 1;
                int current_num = num;
                while(hashset.contains(current_num+1)){
                    length++;
                    current_num++;
                }
                max_length = Math.max(max_length, length); 
            }    
        }
        return max_length;
    }
}
