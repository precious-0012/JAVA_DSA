public class linkedListImplementation
{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class Queue{
        Node f;
        Node r;
        int size;
        void add(int val){
            Node temp = new Node(val);
            if(size==0){
                f = r = temp;
            }else{
                r.next = temp;
                r = temp;
            }
            size++;
        }
        int remove(){
            if(f==null){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int peek = f.data;
            f = f.next;
            size--;
            return peek;
        }
        int peek(){
            if(f==null){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return f.data;
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        void display(){
            if(f==null){
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
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.display();
		q.remove();
		q.display();
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
	}
}