//110 Balanced Binary Tree
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //we can also add memoization
public class Solution {
    public boolean isBalanced(TreeNode root) {
         if(root==null)
           return true;
        else
            {
                if(Math.abs(depth(root.left)-depth(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right))
                  return true;
                 else
                   return false;
                  
            }
        
    }
    
    public int depth(TreeNode node){
        
         if(node==null)
           return 0;
         else
            return Math.max(depth(node.left)+1,depth(node.right)+1);
        
    }
}