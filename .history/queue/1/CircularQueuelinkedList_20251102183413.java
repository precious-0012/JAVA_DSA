public class circularQueuelinkedList
{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class CircularQueue{
        Node f;
        Node r;
        int size;
        void add(int val){
            Node temp = new Node(val);
            if(size==0){
                f = r= temp;
            }
            r.next = temp;
            r = temp;
            r.next = f;
            size++;
        }
        int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty");
            }
            int peek = f.val;
            if(size==1) f = r = null;
            else{
                f = f.next;
                r.next = f;
            }  
            size--;
            return peek;
        }
        int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty");
            }
            return f.val;
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        int size(){
            return size;
        }
        void display()throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty");
            }
            Node temp = f;
            while(temp!=r){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.print(r.val);
            System.out.println();
        }
    }
	public static void main(String[] args) throws Exception{
		CircularQueue cq = new CircularQueue();
		cq.add(1);
	    cq.remove();
	    cq.display();
	}
}