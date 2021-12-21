/*
https://youtu.be/mxztZ_Bh6nA 
https://leetcode.com/problems/two-sum/
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> hm = new HashMap<>();// value , index
        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];
            if(hm.containsKey(rem))
                return new int[]{hm.get(rem) , i};
            hm.put(nums[i] , i);
        }
        return new int[]{-1,-1};
        
        
    }
}
