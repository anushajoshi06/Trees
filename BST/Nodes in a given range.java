/*Nodes in a given range

Given a Binary Search Tree and two integers k1 and k2, find and print the elements which are in range k1 and k2 (both inclusive).
Print the elements in increasing order.
Input format :
Line 1 : Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2 : Two Integers k1 and k2
Output Format :
Required elements (separated by space)
Sample Input :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
6 10
Sample Output :
6 7 8 10
*/

public class Solution {

/*	Binary Tree Node class 
 * 
 * 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static void printNodeFromK1ToK2(BinaryTreeNode<Integer> root,int k1,int k2){
		if(root==null){
          return;
        }
      if(root.data>k1){
        printNodeFromK1ToK2(root.left,k1,k2);
      }
      if(root.data>=k1&&root.data<=k2){
        System.out.print(root.data+" ");
      }
      if(root.data<=k2){
        printNodeFromK1ToK2(root.right,k1,k2);
      }
	}
	
	
}
