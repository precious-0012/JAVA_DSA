import java.util.*;
public class removeConsecutiveSequence
{
    public static int[] remove(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);
            else if(st.peek()==arr[i] && i==n-1 || st.peek()!=arr[i+1]) st.pop();
        }
        int[] res = new int[st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i] = st.pop();
        }
        return res;
    }
	public static void main(String[] args) {
	    int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
		arr = remove(arr);
		for(int val:arr) System.out.print(val+" ");
	}
}
//Last data will check first = LIFO = Last data will use first , use can be anything like remove/pop(),access/peek() and push which is not much used in problems isEmpty() 