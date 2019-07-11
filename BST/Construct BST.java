/*Construct BST

Given a sorted integer array A of size n which contains all unique elements. You need to construct a balanced BST from this input array. Return the root of constructed BST.
Note : If array size is even, take first mid as root.
Input format :
Line 1 : Integer n (Size of array)
Line 2 : Array elements (separated by space)
Output Format :
BST elements (in pre order traversal, separated by space)
Sample Input :
7
1 2 3 4 5 6 7
Sample Output :
4 2 1 3 6 5 7 
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

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr){
		
 return SortedArrayToBST(arr,0,arr.length-1);
    }
static BinaryTreeNode<Integer> SortedArrayToBST(int arr[], int start, int end) {
 
        /* Base Case */
        if (start > end) {
            return null;
        }
 
        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(arr[mid]);
 
        /* Recursively construct the left subtree and make it
         left child of root */
        node.left = SortedArrayToBST(arr, start, mid - 1);
 
        /* Recursively construct the right subtree and make it
         right child of root */
        node.right = SortedArrayToBST(arr, mid + 1, end);
         
        return node;
	}
}	