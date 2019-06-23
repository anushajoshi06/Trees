/*Count number of nodes

Given a generic tree, count and return the total number of nodes present in the given tree.
Input format :
Elements in level order form separated by space (as per done in class). Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output Format :
Count of all nodes
Sample Input :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output :
6
*/

public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	
	
	public static int countNodes(TreeNode<Integer> root){
		 int countNodes =0;
      for(TreeNode<Integer> child:root.children){
       countNodes +=countNodes(child);
        
      }
      return countNodes+1;
	}
		
}
