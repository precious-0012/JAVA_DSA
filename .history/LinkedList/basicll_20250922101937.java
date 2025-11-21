public class basicll{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void insertAtEnd(Node head,int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next!=null){
            t = t.next;
        }
        t.next = temp;
    }    
    public static void display(Node temp){
        //base case
        if(temp==null) return;  
        //self work
        System.out.print(temp.data+" "); 
        //recursive work
        display(temp.next);
    }
    public static void displayReverse(Node temp){
        //base case
        if(temp==null) return;  
        //recursive work
        displayReverse(temp.next);
        //self work
        System.out.print(temp.data+" "); 
    }
    public static int length(Node temp){
        if(temp==null) return 0;
        return length(temp.next) + 1;
    }
    public static void main (String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(100);
        //So we have created nodes = 5 3 9 8 16 100
        a.next = b; //5->3 9 8 16 100
        b.next = c; //5->3->9 8 16 100
        c.next = d; //5->3->9->8 16 100
        d.next = e; //5->3->9->8->16 100
        d.next = e; //5->3->9->8->16 100
        e.next = f; //5->3->9->8->16->100
        // display(a);
        // System.out.println();
        // displayReverse(a);
        // System.out.println();
        // System.out.println(length(a));
        insertAtEnd(a,87);
        display(a);
    }
}