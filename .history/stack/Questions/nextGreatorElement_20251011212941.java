import java.util.*;
public class nextGreatorElement
{
    public static int[] nextGreator(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        st.push(arr[n-1]);
        ans[n-1] = -1;
        for(int i=n-2;i>=0;i--){
            while(st.size()!=0 && arr[i]>st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
	public static void main(String[] args) {
		int[] arr = {1,3,2,1,8,6,3,4};
		int[] ans = nextGreator(arr);
		for(int val:ans) System.out.print(val+" ");
	}
}