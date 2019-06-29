/*Count Leaf Nodes

Given a Binary Tree, find and return the count of leaf nodes. Leaf nodes are those, who don't have any children.
Root is also leaf node if both its child are null.
Input format :
Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Output Format :
count of leaf nodes
Sample Input :
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
Sample Output :
4                
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
	
	public static int noOfLeafNodes(BinaryTreeNode<Integer> root){
		
if(root==null){
  return 0;
} 
     // BinaryTreeNode<Integer>leftMax=noOfLeafNodes(root.left);
      //BinaryTreeNode<Integer>rightMax=noOfLeafNodes(root.right);
      
      if(root.left==null && root.right==null){
        return 1;
      }
      return noOfLeafNodes(root.left) + noOfLeafNodes(root.right);
	}
	
}
   