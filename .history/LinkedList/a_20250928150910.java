public class doubleLL
{
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node random){
        Node temp = random;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static Node insertAtHead(Node head,int val){
        Node t = new Node(val);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void insertAtTail(Node head,int val){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(val);
        temp.next = t;
        t.prev = temp;
    }
    public static void insertAt(Node head,int idx,int val){
        Node s = head;
        for(int i=0;i<idx-1;i++){
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(val);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }
    public static Node deleteAtHead(Node head){
        head = head.next;
        head.prev = null;
        return head;
    }
    public static void deleteAtTail(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp = temp.prev;
        temp.next = null;
    }
    public static void deleteAt(Node head,int idx){
        Node temp = head;
       for(int i =0;i<idx-1;i++){
           temp = temp.next;
       }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
    
	public static void main(String[] args) {
		Node a = new Node(4);
		Node b = new Node(10);
		Node c = new Node(2);
		Node d = new Node(99);
		Node e = new Node(13);
		a.next = b;
		b.prev = a;
		b.next = c;
		c.prev = b;
		c.next = d;
		d.prev = c;
		d.next = e;
		e.prev = d;
		//insertAtTail(a,90);
		//insertAt(a,2,40);
 		//display(a);
 	    //displayrev(e);
 		//display2(c);
        // Node newHead = insertAtHead(a,35);
        // display(newHead);
        // Node newHead = deleteAtHead(a);
        deleteAtTail(a);
        display(a);
        
	}
}