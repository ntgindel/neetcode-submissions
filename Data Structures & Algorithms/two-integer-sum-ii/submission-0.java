class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while(l < r && (numbers[l] + numbers[r] != target)){
            if((target - numbers[l]) < numbers[r]){
                r--;
            }
            else if(target - numbers[l] > numbers[r]){
                l++;
            }
        }
        return new int[] {l + 1, r + 1};
        
    }
}
