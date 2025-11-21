public class dequeArray
{
    public static class Deque{
        private int[] arr = new int[5];
        private int f = -1;
        private int r = -1;
        private int size;
        void addFirst(int val){
            if(size==arr.length){
                System.out.println("Queue is full!");
                return;
            }
            if(size==0){
                f = r = 0;
                arr[f] = val;
            }
            else if(f!=0){
                arr[--f] = val;
            }
            else if(f==0){
                f = arr.length-1;
                arr[f]=val;
            }
            size++;
        }
        void addLast(int val){
            if(size==arr.length){
                System.out.println("Queue is full!");
                return;
            }
            if(size==0){
                f = r = 0;
                arr[r] = val;
            }
            else if(r!=arr.length-1){
                arr[++r] = val;
            }
            else if(r==arr.length-1){
                r = 0;
                arr[r] = val;
            }
            size++;
        }
        int removeFirst(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int peek = arr[f];
            if(f<=r){
                arr[f++] = 0;
            }
            else if(f>r){
                if(f==arr.length-1){
                    arr[f] = 0;
                    f = 0;
                }else if(f<arr.length-1){
                    arr[f++] = 0;
                }
            }
            size--;
            return peek;
        }
        int removeLast(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int peek = arr[r];
            if(r>=f){
                arr[r--] = 0;
            }
            else if(r<f){
                if(r==0){
                    arr[r] = 0;
                    r = arr.length-1;
                }else if(r>0){
                    arr[r--] = 0;
                }
            }
            size--;
            return peek;
            
        }
        int getFirst(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[f];
        }
        int getLast(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[r];
        }
        void add(int val){
            addLast(val);
        }
        int remove(){
            return removeFirst();
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
            if(f<=r){
                for(int i=f;i<=r;i++) System.out.print(arr[i]+" ");
            }else if(f>r){
                for(int i=f;i<arr.length;i++) System.out.print(arr[i]+" ");
                for(int i=0;i<=r;i++) System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		Deque d = new Deque();
		d.addFirst(1);
		d.addLast(2);
		d.addLast(3);
		d.add(4);
		d.removeFirst();
		d.removeFirst();
		d.removeLast();
		d.removeLast();
		d.display();
	}
}
