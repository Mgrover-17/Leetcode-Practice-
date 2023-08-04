import java.util.Stack;

public class reverde {
    static void reverse(Stack<Integer> s)
    {
       if (s.empty()) {
            return;
        }
        
        Integer i = s.get(0);
        s.remove(0);
        
        reverse(s);
        
        s.push(i);
    }
}
