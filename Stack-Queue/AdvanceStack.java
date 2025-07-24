import java.util.Stack;

public class AdvanceStack<T> extends Stack<T> {
    public T peekSecondLast() {
         try {
             T last = super.peek();
             super.pop();
             T ans = super.peek();
             super.push(last);
             return ans;
         }catch(Exception e) {
             return null;
         }

    }

    public void insertAtBottom(T item) {
        super.add(0,item);

    }
}
