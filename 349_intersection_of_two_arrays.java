#---------------
# 6 ms with O(n)
#---------------

package org.cjy.leetcode;

import java.util.*;

class Solution{
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> intersect = new HashSet<Integer>();
		for(int i=0; i<nums1.length; i++){
			set.add(nums1[i]);
		}
		for(int i=0; i<nums2.length; i++){
			if(set.contains(nums2[i])){
				intersect.add(nums2[i]);
			}
		}
		int[] result = new int[intersect.size()];
		int i = 0;
		for(Integer num: intersect){
			result[i++] = num;
		}
		return result;
	}
}

public class SolutionDemo {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums1 = new int[] {1,2,2,3,4,5};
		int[] nums2 = new int[] {2,3,3,7,8,9};
		int[] result = s.intersection(nums1, nums2);
		for(Integer num: result){
			System.out.print(num + " ");
		}
	}
}
