import java.util.*;

import org.w3c.dom.Node;

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.    
    ArrayList<Integer> findSpiral(Node root) 
    {
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        q.add(root);
        q.add(null);
        list.add(root.data);
        int i=0;
        while(!q.isEmpty())
        { 
            Node curr = q.remove();
            if(i%2 !=0 && i!=0)
            {
                if(curr != null)
                list.add(curr.data);
            }
            if(i%2 ==0 && i!=0)
            {
                if(curr!=null)
                 stack.add(curr.data);
            }
            if(curr == null)
            {
                if(q.isEmpty())
                break;
                else
                q.add(null);
                i++;
                 if(i%2 != 0)
               {
                while(!stack.isEmpty())
                {
                    list.add(stack.pop());
                }
               }
            }
            else
            {
                  if(curr.left!=null)
                    q.add(curr.left);
                  if(curr.right!=null)
                    q.add(curr.right);
            }
        }
                while(!stack.isEmpty())
                {
                    list.add(stack.pop());
                }
        return list;
    }
}

