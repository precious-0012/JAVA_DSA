import java.util.*;
public class reverseQueue
{
    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        System.out.println(q);
		while(!q.isEmpty()){
		    s.push(q.remove());
		}
		while(!s.isEmpty()){
		    q.add(s.pop());
		}
		System.out.println(q);
    }
    public static void reverseKelementOfQueue(Queue<Integer> q,int k){
        Stack<Integer> s = new Stack<>();
        System.out.println(q);
        for(int i=0;i<k;i++){
            s.push(q.remove());
        }
        for(int i=0;i<k;i++){
            q.add(s.pop());
        }
        for(int i=0;i<q.size()-k;i++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		//reverseQueue(q);
		reverseKelementOfQueue(q,3);
	}
}