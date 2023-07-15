class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int mid= (sizeOfStack+1)/2;
         double res = Math.ceil(mid);
        s.remove((int)res-1);
        return;

    } 
}