/*Max Data Node

Given a Binary Tree, find and return the node with maximum data. Return the complete node. Return null is binary tree is empty.
Input format :
Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Output Format :
Maximum data node
Sample Input :
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
Sample Output :
14           
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
	
	public static BinaryTreeNode<Integer> maxDataNode(BinaryTreeNode<Integer> root){
		
if(root==null){
  return null;
}     
      BinaryTreeNode<Integer>max=root;
      
      BinaryTreeNode<Integer>leftMax=maxDataNode(root.left);
      BinaryTreeNode<Integer>rightMax=maxDataNode(root.right);
      
      if(leftMax!=null && leftMax.data.compareTo(max.data)>0){
        max=leftMax;
      }
       if(rightMax!=null && rightMax.data.compareTo(max.data)>0){
        max=rightMax;
       }
      return max;
      
	}
	
}
       