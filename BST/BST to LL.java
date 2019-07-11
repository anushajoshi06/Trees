/*BST to LL

Given a BST, convert it into a sorted linked list. Return the head of LL.
Input format :
Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Output Format :
Linked list elements (separated by space)
Sample Input :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
Sample Output :
2 5 6 7 8 10
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

/* LinkedList Node Class
*
*	
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}
*/

  
	public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root){
		
		
     if(root==null){
       return null;
     }
    LinkedListNode<Integer> rootNode=new LinkedListNode<>(root.data);
    LinkedListNode<Integer> lefthead= BSTToSortedLL(root.left);
    LinkedListNode<Integer> righthead=BSTToSortedLL(root.right);
      
      rootNode.next=righthead;
      if(lefthead!=null){
        LinkedListNode<Integer> temp=lefthead;
        
        while(temp.next!=null){
          temp=temp.next;
        }
        temp.next=rootNode;
        
        return lefthead;
      }
      else{
       rootNode.next=righthead;
        return rootNode;
      }
      
      
      
	}
}	