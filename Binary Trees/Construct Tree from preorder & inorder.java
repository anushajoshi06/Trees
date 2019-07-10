/*Construct Tree from preorder & inorder

Given Preorder and Inorder traversal of a binary tree, create the binary tree associated with the traversals.You just need to construct the tree and return the root.
Note: Assume binary tree contains only unique elements.
Input format :

Line 1 : n (Total number of nodes in binary tree)

Line 2 : Pre order traversal

Line 3 : Inorder Traversal

Output Format :

Elements are printed level wise, each level in new line (separated by space).

Sample Input :
12
1 2 3 4 15 5 6 7 8 10 9 12
4 15 3 2 5 1 6 10 8 7 9 12
Sample Output :
1 
2 6 
3 5 7 
4 8 9 
15 10 12
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

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,
			int[] in){
		
			// Write your code here
		 int preStart = 0;
    int preEnd = pre.length-1;
    int inStart = 0;
    int inEnd = in.length-1;
 
    return  getTreeFromPreorderAndInorder(pre, preStart, preEnd, in, inStart, inEnd);
}
 
public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd){
    if(preStart>preEnd||inStart>inEnd){
        return null;
    }
 
    int val = pre[preStart];
    BinaryTreeNode<Integer> p = new BinaryTreeNode<Integer>(val);
 
    //find parent element index from inorder
    int k=0;
    for(int i=0; i<in.length; i++){
        if(val == in[i]){
            k=i;
            break;
        }
    }
 
    p.left =  getTreeFromPreorderAndInorder(pre, preStart+1, preStart+(k-inStart), in, inStart, k-1);
    p.right=  getTreeFromPreorderAndInorder(pre, preStart+(k-inStart)+1, preEnd, in, k+1 , inEnd);
 
    return p;
	}

}
