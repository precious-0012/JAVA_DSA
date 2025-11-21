import java.util.ArrayList;
public class criticalPointsMaxMinDistance
{
    public static class Node{
        Node prev;
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static ArrayList<Integer> maxMinDistance(Node head){
        Node temp = head.next;
        ArrayList<Integer> a = new ArrayList<>();
        int idx = 1;
        while(temp.next!=null){
            if(temp.prev.val<temp.val && temp.val>temp.next.val) a.add(idx);
            if(temp.prev.val>temp.val && temp.val<temp.next.val) a.add(idx);
            idx++;
            temp = temp.next;
        }
        System.out.println(a);
        int maxDist = a.get(a.size()-1)-a.get(0);
        int minDist = Integer.MAX_VALUE;
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i+1)-a.get(i)<minDist) minDist=a.get(i+1)-a.get(i);
        }
        a.clear();
        a.add(maxDist);
        a.add(minDist);
        return a;
    }
    
	public static void main(String[] args){
	    Node a = new Node(1);
	    Node b = new Node(2);
	    Node c = new Node(5);
	    Node d = new Node(3);
	    Node e = new Node(2);
	    Node f = new Node(7);
	    Node g = new Node(8);
	    Node h = new Node(9);
	    Node i = new Node(1);
	    Node j = new Node(10);
	    a.next = b;
	    b.prev = a;
	    b.next = c;
	    c.prev = b;
	    c.next = d;
	    d.prev = c;
	    d.next = e;
	    e.prev = d;
	    e.next = f;
	    f.prev = e;
	    f.next = g;
	    g.prev = f;
	    g.next = h;
	    h.prev = g;
	    h.next = i;
	    i.prev = h;
	    i.next = j;
	    j.prev = i;
	    System.out.println(maxMinDistance(a));
	}
}
