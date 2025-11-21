public class arrayImplementation
{
    public static class Queue{
        private int[] arr = new int[5];
        private int f;
        private int r;
        private int size;
        void add(int val){
            if(r==arr.length){
                System.out.println("Queue is full!");
                return;
            }
            arr[r++] = val;
            size++;
        }
        int remove(){
            if(f==r){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int peek = arr[f];
            arr[f] = 0;
            f++;
            size--;
            return peek;
        }
        int peek(){
            if(f==r){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[f];
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }    
            for(int i=f;i<r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		Queue q = new Queue();
		System.out.println(q.size());
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
        q.remove();
        q.display();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
	}
}
