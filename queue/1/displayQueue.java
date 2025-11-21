import java.util.*;
public class displayQueue
{
    public static void displayRev(Queue<Integer> q){
        if(q.isEmpty()) return;
        int ele = q.remove();
        displayRev(q);
        System.out.print(ele+" ");
        q.add(ele);
    }
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		// rear -> 5 4 3 2 1 -> front
		//Queue<Integer> helper = new ArrayDeque<>();
		//while(!q.isEmpty()){
		//    System.out.print(q.peek()+" ");
		//    helper.add(q.remove());
		//}
		//while(!helper.isEmpty()){
		//    q.add(helper.remove());
		//}
		displayRev(q);
	}
}