import java.util.*;
public class reorderQueue
{
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		Stack<Integer> s = new Stack<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		int mid = q.size()/2;
		for(int i=0;i<mid;i++) s.push(q.remove());
		while(!s.isEmpty()) q.add(s.pop());
		for(int i=0;i<mid;i++) s.push(q.remove());
		for(int i=0;i<mid;i++){
		    q.add(s.pop());
		    q.add(q.remove());
		}
		while(!q.isEmpty()) s.push(q.remove());
		while(!s.isEmpty()) q.add(s.pop());
		System.out.println(q);
	}
}