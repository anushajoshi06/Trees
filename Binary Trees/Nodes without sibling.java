/*Nodes without sibling

Given a binary tree, print all nodes that don’t have a sibling.
Edit : Print the elements in different lines. And order of elements doesn't matter.
Input format :
Elements in level order form (separated by space). If any node does not have left or right child, take -1 in its place.
Output format :
Print nodes separated by new line.
Sample Input :
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output :
9    
*/

import java.util.ArrayList;


public class Solution {

	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		
		// Write your code here
if(root!=null){
		printNodesWithoutSibling(root.left);
		if(root.left==null && root.right != null){
			System.out.println(root.right.data);
		}
		if(root.left!=null && root.right == null){
			System.out.println(root.left.data);
		}
		printNodesWithoutSibling(root.right);
	}

    }

}
