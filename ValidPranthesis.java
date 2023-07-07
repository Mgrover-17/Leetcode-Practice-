import java.util.Stack;

class Solution {
    public boolean isValid(String s){
    Stack<Character>st=new Stack();
    for(char c:s.toCharArray()){
        if(c=='['||c=='{'||c=='('){
            st.push(c);
        }
        else{
            if(st.empty()){
                return false;
            }
            else{
            char m=st.peek();
        
         if(c==']'&& m=='[')
         {
             st.pop();
             }
             else if(c=='}'&& m=='{')
             {
                 st.pop();
                 }
                else if(c==')'&& m=='('){
             st.pop();
            }
        else{
                return false;
            }
            }
    }
    }
    if(st.empty()){
    return true;
    }
    else{
        return false;
    }
    }
}
