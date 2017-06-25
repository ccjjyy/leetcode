#------------------
# 409 ms with O(n2)
#------------------

package org.cjy.leetcode;

import java.util.*;

class Solution{
	public List<List<Integer>> threeSum(int[] num) {
	    Arrays.sort(num);
	    List<List<Integer>> list = new ArrayList<List<Integer>>();
	    HashSet<List<Integer>> set = new HashSet<List<Integer>>();
	    for(int i=0; i<num.length; i++){
	        for(int j=i+1,k=num.length-1; j<k; ){
	            if(num[i]+num[j]+num[k] == 0){
	                List<Integer> l= new ArrayList<Integer>();
	                l.add(num[i]);
	                l.add(num[j]);
	                l.add(num[k]);
	                if(set.add(l)){
	                	list.add(l);
	                }
	                j++;
	                k--;
	            }
	            else if(num[i]+num[j]+num[k] < 0){
	            	j++;
	            }
	            else{
	            	k--;
	            }
	        }
	    }
	    return list;
	}
}

public class SolutionDemo {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] num = new int[] {-1,0,1,2,-1,4};
		List<List<Integer>> list = s.threeSum(num);
		for(int i=0; i<list.size(); i++){
			List<Integer> curr = list.get(i);
			for(int j=0; j<curr.size(); j++){
				System.out.print(curr.get(j) + " ");
			}
			System.out.println();
		}
	}
}
