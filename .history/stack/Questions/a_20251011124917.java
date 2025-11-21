import java.util.*;
public class removeConsecutiveSequence
{
    public static int[] remove(int[] arr){
		Stack<Integer> st = new Stack<>();
		int j=1;
		for(int i=0;i<arr.length;i++){
		    if(st.size()==0) st.push(arr[i]);
		    else if(st.peek()!=arr[i]) st.push(arr[i]);
		    else if(st.peek()==arr[i] && st.peek()!=arr[j]) st.pop();
		    j++;
		}
		int  n = st.size();
		int[] brr = new int[n];
		for(int i=n-1;i>=0;i--){
		    brr[i] = st.pop();
		}
		return  brr;
    }
	
	public static void main(String[] args) {
	    int[] arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
		int[] ans = remove(arr);
		for(int val:ans) System.out.print(val+" ");
	}
}