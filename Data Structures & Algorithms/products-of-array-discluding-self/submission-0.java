class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int zeroCount = 0;
        int total = 1;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
            }
            else{
                total *= nums[i];
            }
        }
        if(zeroCount > 1){
            return res;
        }

        for(int i = 0; i < nums.length; i++){
            if(zeroCount > 0){
                if(nums[i] == 0){
                    res[i] = total;
                }
                else{
                    res[i] = 0;
                }
            }
            else{
                res[i] = total/nums[i];
            }

        }
        return res;
        
    }
}  
