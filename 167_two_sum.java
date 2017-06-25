package org.cjy.leetcode;

class Solution{
	public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int low = 0;
        int high = nums.length - 1;
        for(int i=0; i<nums.length; i++){
            if(nums[low] + nums[high] == target){
                result[0] = low + 1;
                result[1] = high + 1;
                break;
            }
            else if(nums[low] + nums[high] < target){
                low++;
            }
            else{
                high--;
            }
        }
        return result;
    }
}

public class SolutionDemo {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {2,7,11,15};
		int target = 18;
		int[] result = s.twoSum(nums, target);
		
		for(int i=0; i<result.length; i++){
			System.out.print(result[i] + " ");
		}
	}
}
