import java.util.*;
public class firstNegativeElementInWindow
{
    public static ArrayList<Integer> firstNegativeByQueue(int arr[], int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int n = arr.length;
        for(int i=0;i<n;i++) if(arr[i]<0) q.add(i);
        for(int i=0;i<n-k+1;i++){
            if(!q.isEmpty() && q.peek()<i) q.remove();
            if(!q.isEmpty() && q.peek()>=i && q.peek()<=i+k-1) list.add(arr[q.peek()]);
            else list.add(0);
        }
        return list;
    }
    public static ArrayList<Integer> firstNegativeBasicApproach(int arr[], int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n-k+1;i++){
            boolean find = false;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    list.add(arr[j]);
                    find = true;
                    break;
                }
            }
            if(!find) list.add(0);
        }
        return list;
    }
	public static void main(String[] args) {
		int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
		System.out.println(firstNegativeByQueue(arr,3));
		 
	}
}