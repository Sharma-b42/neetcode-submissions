class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap= new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int temp= target-nums[i];
            
 
            if(hashMap.containsKey(temp))
                return new int[] {hashMap.get(temp), i};
            hashMap.put(nums[i], i); 
        }
    return null;
    }
}
