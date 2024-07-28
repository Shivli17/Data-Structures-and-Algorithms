/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        helper(root, arr);
        Collections.sort(arr);
        System.out.println(arr);
        return arr.get(k-1);
    }
    
    public void helper(TreeNode root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        else{
            arr.add(root.val);
            if(root.left!=null){
                helper(root.left, arr);
            }
            if(root.right!=null){
                helper(root.right, arr);
            }
        }
    }
}