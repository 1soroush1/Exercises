import java.util.PriorityQueue;

public class AdvanceQueue<T> extends PriorityQueue<T> {
    public T peekNext() {
        try {
            return super.peek();
        }catch (Exception e) {
            return null;
        }
    }

    public void insertAtStart(T item) {
        super.add(item);
    }
}