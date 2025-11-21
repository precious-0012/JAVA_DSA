public class palindromeDLL
{
    public static class Node{
        Node prev;
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static boolean isPalindrome(Node head){
        Node t1 = head;
        Node t2 = head;
        while(t2.next!=null){
            t2 = t2.next;
        }
        while(t1!=t2 && t1.prev!=t2){ //important to use the 2nd condition if i dont use then t1 and t2 will go upto null with increase no of operation by 2n
            if(t1.val!=t2.val) return false;
            t1 = t1.next;
            t2 = t2.prev;
        }
        return true;
    }
	public static void main(String[] args){
	    Node a = new Node(1);
	    Node b = new Node(2);
	    Node c = new Node(3);
	    Node d = new Node(3);
	    Node e = new Node(2);
	    Node f = new Node(1);
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
	    System.out.println(isPalindrome(a));
	}
}