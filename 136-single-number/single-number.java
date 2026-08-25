class Solution {
    public int singleNumber(int[] nums) {
        int sv=0;
        for(int i:nums){
            sv^=i;
        }
        return sv;
    }
}