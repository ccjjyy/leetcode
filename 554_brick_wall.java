package org.cjy.leetcode;

import java.util.*;


class Solution{
	public int leastBricks(List<List<Integer>> wall) {
		if(wall.size() == 0) {return 0;}
		int count = 0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(List<Integer> list: wall){
			int length = 0;
			for(int i=0; i<list.size()-1; i++){
				length += list.get(i);
				map.put(length, map.getOrDefault(length, 0)+1);
				count = Math.max(count, map.get(length));
			}
		}
		return wall.size() - count;
	}
}

public class SolutionDemo {
	public static void main(String[] args) {
		Solution s = new Solution();
		List<List<Integer>> wall = new LinkedList<>();
		
		List<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(1);
		List<Integer> list2 = new LinkedList<>();
		list2.add(3);
		list2.add(1);
		list2.add(2);
		List<Integer> list3 = new LinkedList<>();
		list3.add(1);
		list3.add(3);
		list3.add(2);
		List<Integer> list4 = new LinkedList<>();
		list4.add(2);
		list4.add(4);
		List<Integer> list5 = new LinkedList<>();
		list5.add(3);
		list5.add(1);
		list5.add(2);
		List<Integer> list6 = new LinkedList<>();
		list6.add(1);
		list6.add(3);
		list6.add(1);
		list6.add(1);
		
		wall.add(list1);
		wall.add(list2);
		wall.add(list3);
		wall.add(list4);
		wall.add(list5);
		wall.add(list6);
		
		System.out.println(s.leastBricks(wall));
	}
}
