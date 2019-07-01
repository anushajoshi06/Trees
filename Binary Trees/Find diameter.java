/*Find diameter

Given a Binary Tree, find and return the diameter of input binary tree.
Diameter is - largest count of nodes between any two leaf nodes in the binary tree (both the leaf nodes are inclusive).
Input format :
Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Output Format :
diameter
Sample Input :
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
Sample Output :
7               
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
  public static int height(BinaryTreeNode<Integer> root){
    return root==null ? 0:Math.max(height(root.left),height(root.right)) + 1;
    }
                                 
	
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		
      if(root==null){
        return 0;
      }
      int lH=height(root.left);
      int rH=height(root.right);
      int op1=lH+rH+1;
      int lD=diameterOfBinaryTree(root.left);
      int rD=diameterOfBinaryTree(root.right);
      return Math.max(Math.max(lD,rD),op1);
      
      
	}
	
	
}
    