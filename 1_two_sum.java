package org.cjy.leetcode;

import java.util.*;

class Solution{
	public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}

public class SolutionDemo {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {2,7,11,15};
		int target = 17;
		int[] result = s.twoSum(nums, target);
		
		for(int i=0; i<result.length; i++){
			System.out.print(result[i] + " ");
		}
	}
}
