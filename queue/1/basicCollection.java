import java.util.*;
public class basicCollection
{
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		q.add(1);
		System.out.println(q.isEmpty());
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q);
		System.out.println(q.size()); 
		q.remove();
		System.out.println(q); 
		q.poll();
		System.out.println(q); 
		System.out.println(q.peek()); 
		System.out.println(q.element()); 
	}
}
