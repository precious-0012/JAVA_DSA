import java.util.*;
public class stockSpan
{
    public static int[] span(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = 1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()!=0 && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0) ans[i] = 1;
            else ans[i] = i - st.peek();
            st.push(i);
        }
        return ans;
    }
	public static void main(String[] args) {
		int[] arr = {100,80,60,70,60,75,85};
		int[] ans = span(arr);
		for(int val:ans) System.out.print(val+" ");
	}
}