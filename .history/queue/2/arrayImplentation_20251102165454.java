import java.util.*;
public class arrayImplmentation
{
    public static class CircularQueue{
        private int[] arr = new int[3];
        private int f = -1;
        private int r = -1;
        private int size;
        void add(int val)  throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is full!");
            }
            else if(size==0){
                f = r = 0;
                arr[r] = val;
            }
            else if(r<arr.length-1){
                arr[++r] = val;
            }
            else if(r==arr.length-1){
                r=0;
                arr[r] = val;
            }
            size++;
        }
        int remove() throws Exception{
            if(size==0) throw new Exception("Queue if Empty!");
            int val = arr[f];
            if(f<arr.length-1) f++;
            else if(f==arr.length-1) f=0;   
            size--;
            return val;
        }
        int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!");
            }
            else return arr[f];
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        void display()throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!");
            }
            
            if(f<=r){
                for(int i=f;i<=r;i++) System.out.print(arr[i]+" ");
            }else if(f>r){
                for(int i=f;i<arr.length;i++) System.out.print(arr[i]+" ");
                for(int i=0;i<=r;i++) System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return size;
        }
    }
	public static void main(String[] args) throws Exception{
		CircularQueue cq = new CircularQueue();
		cq.add(1);
		cq.add(2);
		cq.add(3);
		cq.remove();
		cq.add(1);
		cq.display();
		System.out.println(cq.size());
		System.out.println(cq.peek());
		System.out.println(cq.isEmpty());
	
	}
}
