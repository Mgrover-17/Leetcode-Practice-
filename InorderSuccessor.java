class Solution
{
    public Node result = null;   
	public Node inorderSuccessor(Node root,Node x)
         {
            if(root == null) return root;
            inorderSuccessor(root.left,x);
            if(root == x || result == x)
            {
                result = root;
            }
            inorderSuccessor(root.right, x);
            return result == x ? null : result;
         }
}