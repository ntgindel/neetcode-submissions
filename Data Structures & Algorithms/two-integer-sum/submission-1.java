class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(!seen.keySet().contains(diff)){
                if(!seen.keySet().contains(nums[i])){
                    seen.put(nums[i], i);
                }
            }
            else{
                return new int[] {seen.get(diff), i};
            }

        }
        return null;
        
    }
}
