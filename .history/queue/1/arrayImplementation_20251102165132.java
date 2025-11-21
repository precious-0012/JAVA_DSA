public class Main
{
    public static class Queue{
        private int[] arr = new int[5];
        private int f = -1;
        private int r = -1;
        private int size;
        void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full!");
                return;
            }
            if(f==-1){
                f=r=0;
                arr[r] = val;
            }
            else arr[++r] = val;
            size++;
        }
        int remove(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            arr[f] = 0;
            f++;
            size--;
            return arr[f-1];
        }
        int peek(){
            if(size==0){
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
            for(int i=f;i<=r;i++){
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
