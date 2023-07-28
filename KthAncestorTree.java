import java.util.*;

class Node
{
    int ans ;
    int data;
    Node right;
    Node left;
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        ArrayList<Integer> al = new ArrayList<>();
        helper(root,k,node,al);
        return ans;
    }
    
    void helper(Node root,int k, int node, ArrayList<Integer> al) {
        if(root== null) {
            return;
        }
        if(root.data == node) {
            if(al.size() < k)    ans =-1;
            else    ans = al.get(al.size()-k);
            return;
        } 
        al.add(root.data);
        helper(root.left,k,node,al);
        helper(root.right,k,node,al);
        al.remove(al.size()-1);
    }
}