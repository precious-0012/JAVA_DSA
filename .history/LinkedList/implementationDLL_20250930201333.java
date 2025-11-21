public class implementationDLL
{
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static class DoublyLinkedList{
        Node head;
        Node tail;
        int size;
        
        void insertAtHead(int val){
            Node t = new Node(val);
            if(head==null){
                head = t;
                tail = t;
            }else{
                t.next = head;
                head.prev = t;
                head = t;
            }    
            size++;
        }
        void insertAtTail(int val){
            if(head==null){
                insertAtHead(val);
                return;
            }
            Node t = new Node(val);
            tail.next = t;
            t.prev = tail;
            tail = tail.next;
            size++;
        }
        void insertAt(int idx,int val){
            if(idx<0 || idx>size){
                System.out.println("Wrong input");
                return;
            }
            if(idx==0){
                insertAtHead(val);
                return;
            }
            if(idx==size){
                insertAtTail(val);
                return;
            }
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next.prev = t;
            temp.next = t;
            t.prev = temp;
            size++;
        }
        void deleteAtHead(){
            if(size==0){
                System.out.println("list is empty");
                return;
            }
            if(size==1){
                head = null;
                tail = null;
            }else{
                head = head.next;
                head.prev = null;
            }    
            size--;
        }
        void deleteAtTail(){
            if(size==0){
                System.out.println("list is empty");
                return;
            }
            if(size==1){
                deleteAtHead();
                return;
            }else{
                tail = tail.prev;
                tail.next = null;
            }
                size--;
        }
        void deleteAt(int idx){
            if(idx<0 || idx>=size){
                System.out.println("Wrong input");
                return;
            }
            if(idx==0){
                deleteAtHead();
                return;
            }
            if(idx==size-1){
                deleteAtTail();
                return;
            }
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void displayReverse(){
            Node temp = tail;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.prev;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
    }
	public static void main(String[] args) {
		DoublyLinkedList ll = new DoublyLinkedList();
		ll.insertAtHead(1);
		ll.insertAtTail(2);
 		ll.display();
		ll.insertAt(0,22);
 		//ll.display();
		ll.deleteAtTail();
 		//ll.display();
 		ll.deleteAt(1);
		//ll.display();
 		//System.out.println(ll.size());
        ll.displayReverse();
	}
}