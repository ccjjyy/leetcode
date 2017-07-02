package org.cjy.leetcode;

import java.util.*;


class Solution{
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<C.length; i++){
			for(int j=0; j<D.length; j++){
				map.put(C[i]+D[j], map.getOrDefault(C[i]+D[j], 0)+1);
			}
		}
		int result = 0;
		for(int i=0; i<A.length; i++){
			for(int j=0; j<B.length; j++){
				result += map.getOrDefault(-(A[i]+B[j]), 0);
			}
		}
		return result;
	}
}

public class SolutionDemo {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] A = {1,2};
		int[] B = {-2,-1};
		int[] C = {-1,2};
		int[] D = {0,2};
		System.out.println(s.fourSumCount(A, B, C, D));
	}
}
