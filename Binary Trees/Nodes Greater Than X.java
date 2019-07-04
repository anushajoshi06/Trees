/*Nodes Greater Than X

Given a Binary Tree and an integer x, find and return the count of nodes which are having data greater than x.
Input format :
Line 1 : Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2 : Integer x
Output Format :
count
Sample Input :
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
8
Sample Output :
3          
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
	
	public static int numNodesGreaterX(BinaryTreeNode<Integer> root,int x){
		
 int count=0;
  if(root==null)
        return 0;
    if(root.data>x){
       // System.out.print(root.data + " ");
        count++;
    }
    int countLeft = numNodesGreaterX(root.left, x);
    int countRight = numNodesGreaterX(root.right, x);

    return count + countLeft + countRight;
	}
	
}
     