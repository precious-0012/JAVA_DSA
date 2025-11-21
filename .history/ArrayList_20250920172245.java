import java.util.Arrays;
public class ArrayList
{
    int[] arr = new int[1];
    int size = 0;
    int idx = 0;
    void add(int element){
        if(idx==arr.length){
            int[] brr=Arrays.copyOf(arr,arr.length*2);
            arr=brr;
        }
        arr[idx++] = element;
        size++;
    }   
    int get(int idx){
        return arr[idx];
    }
    int size(){
        return size;
    }
    void set(int ele,int idx){
        arr[idx] = ele;
    }
	public static void main(String[] args){
	    ArrayList arr = new ArrayList();
	    arr.add(1);
	    arr.add(2);
	    arr.add(3);
	    System.out.println(arr.get(1));
	    System.out.println(arr.size());
	    arr.set(4,0);
	    System.out.println(arr.get(0));
	}
}