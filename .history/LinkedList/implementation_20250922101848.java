public class implementation
{
    //by the help of this class we make a node
    public static class Node{ 
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head;
        Node tail;
        int size;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void insertAtBeginning(int val){
            if(head==null){
                insertAtEnd(val);
            }else{
                Node temp = new Node(val);
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAt(int idx,int val){
            int count=0;
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
            if(idx<0 || idx>size){
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
            if(idx==0){
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            if(idx==size-1){
                temp.next = temp.next.next;
                tail = temp;
                size--;
                return;
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
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            } 
            return count;
        }
    }
	public static void main(String[] args) {
		linkedlist ll = new linkedlist();
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
		//System.out.println(ll.getAt(1));
		//System.out.println(ll.size);
		ll.deleteAt(0);
		ll.display();

	}
}