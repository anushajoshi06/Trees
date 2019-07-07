/*is Balanced

Given a binary tree, check if its balanced i.e. depth of left and right subtrees of every node differ by at max 1. Return true if given binary tree is balanced, false otherwise.
Input format :

Elements in level order form (separated by space). If any node does not have left or right child, take -1 in its place.

Sample Input 1 :
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 1 :
false
Sample Input 2 :
1 2 3 -1 -1 -1 -1
Sample Output 2 :
true
*/

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
	public static int getHeight( BinaryTreeNode<Integer>root){
		if(root==null)return 0;
		return (1+ Math.max(getHeight(root.left), getHeight(root.right)));
    }
	public static boolean checkBalanced(BinaryTreeNode<Integer> root){
		
		// Write your code here
		if(root==null){
          return true;
        }
		int heightdifference = getHeight(root.left)-getHeight(root.right);
		if(Math.abs(heightdifference)>1){
			return false;
		}else{
			return checkBalanced(root.left) && checkBalanced(root.right);
	}

	
    }	
}
