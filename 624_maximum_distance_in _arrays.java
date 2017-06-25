#----------------
# 26 ms with O(n)
#----------------

package org.cjy.leetcode;

import java.util.*;

class Solution{
	public int maxDistance(List<List<Integer>> arrays) {
		int result = Integer.MIN_VALUE;
		int min = arrays.get(0).get(0);
		int max = arrays.get(0).get(arrays.get(0).size()-1);
		
		for(int i=1; i<arrays.size(); i++){
			List<Integer> curr = arrays.get(i);
			result = Math.max(result, Math.abs(curr.get(0) - max));
			result = Math.max(result, Math.abs(curr.get(curr.size() - 1) - min));
			max = Math.max(max, curr.get(curr.size() - 1));
			min = Math.min(min, curr.get(0));
		}
	    return result;
	}
}

public class SolutionDemo {
	public static void main(String[] args) {
		Solution s = new Solution();
		List<List<Integer>> arrays = new ArrayList<List<Integer>>();
		
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list1, 1, 2, 3);
		
		List<Integer> list2 = new ArrayList<Integer>();
		Collections.addAll(list2, 4, 5);
		
		List<Integer> list3 = new ArrayList<Integer>();
		Collections.addAll(list3, 1, 2, 3);

		arrays.add(list1);
		arrays.add(list2);
		arrays.add(list3);
		System.out.println(s.maxDistance(arrays));
	}
}
