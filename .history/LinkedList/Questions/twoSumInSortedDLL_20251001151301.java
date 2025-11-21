import java.util.ArrayList;
public class twoSumInSortedDLL
{
    public static class Node{
        Node prev;
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static ArrayList<Integer> twoSum(Node head,int target){
        Node t1 = head;
        Node t2 = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(t2.next!=null){
            t2 = t2.next;
        }
        while(t1.val<t2.val){
            if(t1.val+t2.val==target){
                arr.add(t1.val);
                arr.add(t2.val);
                break;
            }
            if(t1.val+t2.val>target) t2 = t2.prev;
            if(t1.val+t2.val<target) t1 = t1.next;
        }
        return arr;
    }
	public static void main(String[] args){
	    Node a = new Node(4);
	    Node b = new Node(6);
	    Node c = new Node(9);
	    Node d = new Node(12);
	    Node e = new Node(17);
	    Node f = new Node(67);
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
	    int target = 15;
	    System.out.println(twoSum(a,target));
	}
}