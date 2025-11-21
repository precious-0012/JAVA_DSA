package collectionInterface;
import java.util.*;
public class queueInterface
{
    public static void QueueExample(){
        //LinkedList<Integer> q = new LinkedList<>(); //i can use it but it have all other methods of list and dequeue which i dont need , i want to use the methods of Queue 
        Queue<Integer> q = new LinkedList<>(); //here i can use only the methods which is in Queue interface
        q.add(1);
        q.add(2);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);
        q.clear();
        System.out.println(q);
    }
    public static void PriorityQueueExample(){
        //PriorityQueue<Integer> pq = new PriorityQueue<>(); //min pq default means smallest number have highest priority
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //max pq
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());
        System.out.println(pq); //highest priority element will be on the top others are in same order how they came
        System.out.println(pq.remove());
        System.out.println(pq);
        System.out.println(pq.peek());
    }
    public static void DequeExample() {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
        System.out.println(dq);
        System.out.println(dq.size());
        dq.clear();
        System.out.println(dq);
    }
	public static void main(String[] args) {
    	DequeExample();
	}
}