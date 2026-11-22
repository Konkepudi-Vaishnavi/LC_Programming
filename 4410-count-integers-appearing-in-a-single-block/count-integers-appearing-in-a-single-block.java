class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(i==0 || nums[i] != nums[i-1]){
                mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
            }
        }
        int res = 0;
        for(int cnt : mp.values()){
            if(cnt == 1){
                res++;
            }
        }
        return res;
    }
}