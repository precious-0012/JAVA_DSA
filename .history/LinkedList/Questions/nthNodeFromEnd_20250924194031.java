public class nthNodeFromEnd{
    public static Node nthNodeFromEnd(Node head,int n){
        int size=0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size - n + 1; 
        temp = head;
        for(int i=0;i<m-1;i++){
            temp = temp.next;
        }
        return temp;
    }
    public static Node nthNodeInOneTraversal(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static Node deleteNthNodeFromEnd(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void display(Node temp){
        if(temp==null) return;  
        System.out.print(temp.data+" "); 
        display(temp.next);
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // Node q = nthNodeInOneTrversal(a,2);
        a = deleteNthNodeFromEnd(a,5);
        display(a);
    }
}