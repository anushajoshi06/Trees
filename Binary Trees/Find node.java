/*Find node

Given a Binary Tree and an integer x, check if node with data x is present in the input binary tree or not. Return true or false.
Input format :
Line 1 : Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2 : Integer x
Output Format :
true or false
Sample Input :
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
7
Sample Output :
true
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
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){
		
 if(root.data==x)
            return true;

        else {
                if (root.left != null)
                return isNodePresent(root.left, x);

                else if (root.right != null)
                return isNodePresent(root.right, x);
        }
    return false;
	}
	
}
