public class dequeLinkedList
{
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    public static class Deque{
        private Node f;
        private Node r;
        private int size;
        void addFirst(int val){
            Node temp = new Node(val);
            if(size==0){
                f = r = temp;
            }else{
                temp.next = f;
                f.prev = temp;
                f = temp;
            }
            size++;
        }
        void addLast(int val){
            Node temp = new Node(val);
            if(size==0){
                f = r = temp;
            }else{
                temp.prev = r;
                r.next = temp;
                r = temp;
            }
            size++;
        }
        int removeFirst(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            else{
                int peek = f.data;
                f = f.next;
                if(f!=null) f.prev = null;
                else r = null;
                size--;
                return peek;
            }
           
        }
        int removeLast(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            else{
                int peek = r.data;
                r = r.prev;
                if(r!=null) r.next = null;
                else f = null;
                size--;
                return peek;
            }
            
        }
        int getFirst(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            else return f.data;
        }
        int getLast(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            else return r.data;
        }
        void add(int val){
            addLast(val);
        }
        void remove(){
            removeFirst();
        }
        int peek(){
            return getFirst();
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        int size(){
            return size;
        }
        void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            Node temp = f;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		Deque d = new Deque();
		d.addFirst(1);
		d.addLast(2);
		d.addLast(3);
		//d.display();
		//d.removeFirst();
		//d.display();
		//System.out.println(d.getLast());
		//System.out.println(d.size());
		//System.out.println(d.isEmpty());
		d.add(4);
		d.remove();
		d.display();
		System.out.println(d.peek());
	}
}