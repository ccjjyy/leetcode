package org.cjy.leetcode;

import java.util.*;

//Input:
//["Shogun", "Tapioca Express", "Burger King", "KFC"]
//["KFC", "Shogun", "Burger King"]
//Output: ["Shogun"]

class Solution{
	public String[] findRestaurant(String[] list1, String[] list2){
		Map<String,Integer> map = new HashMap<>();
		List<String> list = new LinkedList<>();
		int minSum = Integer.MAX_VALUE;
		for(int i=0; i<list1.length; i++){
			map.put(list1[i], i);
		}
		for(int i=0; i<list2.length; i++){
			Integer j = map.get(list2[i]);
			if(j != null && i+j <= minSum){
				if(i+j < minSum){
					list = new LinkedList<>();
					minSum = i + j;
				}
				list.add(list2[i]);
			}
		}
		return list.toArray(new String[list.size()]);
	}
}

public class SolutionDemo {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] list1 = {"Shogun", "KFC", "Burger King", "Tapioca Express"};
		String[] list2 = {"KFC", "Shogun", "Burger King"};
		String[] result = s.findRestaurant(list1, list2);
		for(int i=0; i<result.length; i++){
			System.out.print(result[i] + " ");
		}
	}
}
