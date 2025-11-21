public class linkedListImplementation
{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class Stack{
        private Node head;
        private int size;
        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(size==0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }
        int peek(){
            if(size==0){
               System.out.println("Stack is Empty!");
               return -1; 
            }
            return head.data;
        }
        void displayRec(Node temp){
            if(temp==null) return;
            displayRec(temp.next);
            System.out.print(temp.data+" ");
        }
        void display(){
            displayRec(head);
            System.out.println();  
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
    }
    public static void main(String[] args){
        Stack st = new Stack();
	    st.push(4);
	    st.display(); //4
	    st.push(5); 
	    st.display(); //4 5 
	    st.push(1);
	    st.display(); //4 5 1 
	    System.out.println(st.size());  //3
	    st.pop();
	    st.display(); //4 5
	    System.out.println(st.isEmpty());
	    
    }
}