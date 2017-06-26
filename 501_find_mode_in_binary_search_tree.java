package org.cjy.leetcode;

import java.util.*;

class TreeNode{
	// properties
	int val;
	TreeNode left;
	TreeNode right;
	// constructors
	public TreeNode(int val) {
		super();
		this.val = val;
	}
}

class BST{
	// properties
	TreeNode root;
	// functions
	public void insert(int val){
		TreeNode newNode = new TreeNode(val);
		if(this.root == null){
			this.root = newNode;
		}
		else{
			insertNode(this.root, newNode);
		}
	}
	
	public void insertNode(TreeNode node, TreeNode newNode){
		if(newNode.val <= node.val){
			if(node.left == null){
				node.left = newNode;
			}
			else{
				insertNode(node.left, newNode);
			}
		}
		else{
			if(node.right == null){
				node.right = newNode;
			}
			else{
				insertNode(node.right, newNode);
			}
		}
	}
	
	public TreeNode getRoot(){
		return this.root;
	}
}

class Solution{
	// properties
	private Map<Integer,Integer> map;
	private int max = Integer.MIN_VALUE;
	// functions
	public int[] findMode(TreeNode root){
		if(root == null){
			return new int[0];
		}
		this.map = new HashMap<Integer,Integer>();
		inorder(root);
		List<Integer> list = new LinkedList<Integer>();
		for(int key: this.map.keySet()){
			if(this.map.get(key) == this.max){
				list.add(key);
			}
		}
		int[] result = new int[list.size()];
		for(int i=0; i<result.length; i++){
			result[i] = list.get(i);
		}
		return result;
	}
	
	private void inorder(TreeNode node){
		if(node.left != null){
			inorder(node.left);
		}
		this.map.put(node.val, this.map.getOrDefault(node.val, 0)+1);
		this.max = Math.max(max, map.get(node.val));
		if(node.right != null){
			inorder(node.right);
		}
	}
}

public class SolutionDemo {
	public static void main(String[] args) {
		Solution s = new Solution();
		BST bst = new BST();
		bst.insert(0);
		bst.insert(2);
		bst.insert(3);
		bst.insert(3);
		bst.insert(3);
		int[] result = s.findMode(bst.getRoot());
		for(int i=0; i<result.length; i++){
			System.out.print(result[i] + " ");
		}
	}
}
