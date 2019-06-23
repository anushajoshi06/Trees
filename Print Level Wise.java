/*Print Level Wise

Given a generic tree, print the input tree in level wise order. That is, print the elements at same level in one line (separated by space). Print different levels in differnet lines.
Input format :
Elements in level order form separated by space (as per done in class). Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output Format :
Level wise print
Sample Input :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output :
10
20 30 40 
40 50
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

	
	public static void printLevelWise(TreeNode<Integer> root){
		//TreeNode<Integer> root = new TreeNode(root);
      QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
      pendingNodes.enqueue(root);
      pendingNodes.enqueue(null);
      while(pendingNodes.size()!=1)
      {
        try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
			if(frontNode==null)
            {
              System.out.println();
              pendingNodes.enqueue(null);
              continue;
            }
          if(frontNode == root){
            System.out.print(frontNode.data);
          }else{
            System.out.print(frontNode.data+" ");
          }
	       
          
          
               for(int i=0;i<frontNode.children.size();i++)
               {
                 //System.out.println("abc");
            	   TreeNode<Integer> childNode =frontNode.children.get(i); 
                 pendingNodes.enqueue(childNode);
               }
          
				}
			 catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				
			}
      }
	}
		
}
