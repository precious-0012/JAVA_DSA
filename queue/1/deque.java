import java.util.*;
public class deque
{
	public static void main(String[] args) {
		Deque<Integer> q = new LinkedList<>();
		//q.addLast(1);
		//q.addLast(2);
		//q.addLast(3);
		//q.addLast(4);
		//System.out.println(q);
		//q.addFirst(5);
		//System.out.println(q);
		//q.removeLast();
		//System.out.println(q);
		//q.removeFirst();
		//System.out.println(q);
		//System.out.println(q.getFirst());
		//System.out.println(q.getLast());
		q.addLast(1);
		q.addLast(2);
		q.addLast(1);
		q.addLast(4);
		q.addLast(2);
		q.add(5);
		//q.remove();
		System.out.println(q);
		//System.out.println(q.peek());
		//q.removeAll(q);
		//System.out.println(q);
		q.removeFirstOccurrence(1);
		System.out.println(q);
		q.removeLastOccurrence(2);
		System.out.println(q);
	}
}