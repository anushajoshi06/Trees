/*Search In BST

Given a BST and an integer k. Find if the integer k is present in given BST or not. Return the node with data k if it is present, return null otherwise.
Assume that BST contains all unique elements.
Input Format :
Line 1 : Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2 : Integer k
Output Format :
Node with data k
Sample Input 1 :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
2
Sample Output 1 :
2
Sample Input 2 :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
12
Sample Output 2 :
(empty)
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

	public static BinaryTreeNode<Integer> searchInBST(BinaryTreeNode<Integer> root , int k){
		
if (root==null){
  return null;
}
            
       if(root.data<k){
         return searchInBST(root.right,k);
           
       }
      if(root.data==k){
        return root;
      }
      else{
        return searchInBST(root.left,k);
      }
	}
}