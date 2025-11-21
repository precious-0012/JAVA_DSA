public class implementation {
    public static class Node { 
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList {
        Node head;
        Node tail;
        int size;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
  void insertAtBeginning(int val){
            if(head==null){
                insertAtEnd(val);
                return; 
            }
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }

        void insertAt(int idx,int val){
            if(idx==size){
                insertAtEnd(val);
                return;
            }    
            if(idx==0){
                insertAtBeginning(val);
                return;
            }  
            if(idx<0 || idx>size){
                System.out.println("Wrong input");
                return;
            }
            Node t = new Node(val);
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int idx){
            if(idx<0 || idx>=size){  // ✅ fixed
                System.out.println("Wrong input");
                return -1;
            }    
            Node temp = head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx){
            if(idx<0 || idx>=size){
                System.out.println("Wrong input");
                return;
            }
            if(idx==0){
                head = head.next;
                if(head==null) tail=null; 
                size--;
                return;
            }
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            if(idx==size-1){
                tail = temp; // update tail
            }
            temp.next = temp.next.next;
            size--;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4); //4
        ll.display();
        ll.insertAtEnd(5); //4->5
        ll.display();
        ll.insertAtEnd(12); //4->5->12
        ll.display();
        ll.insertAtBeginning(13); //13->4->5->12
        ll.display();
        ll.insertAt(4,3); //13->4->5->12->3
        ll.display();
        ll.deleteAt(0);   //4->5->12->3
        ll.display();
    }
}
