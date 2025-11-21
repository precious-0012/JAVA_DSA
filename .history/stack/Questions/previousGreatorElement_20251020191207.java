import java.util.*;
public class previousGreatorElement
{
    public static int[] previousGreatorLeftToRight(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[0] = -1;
        st.push(arr[0]);
        for(int i=1;i<n;i++){
            while(st.size()!=0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static int[] previousGreatorRightToLeft(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()!=0 && arr[st.peek()]<arr[i]){
                res[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            if(res[i]==0) res[i] = -1;
        }
        return res;
    }
	public static void main(String[] args) {
		int[] arr = {100,80,60,70,60,75,85};
		arr = previouGreatorRightToLeft(arr);
		for(int val:arr) System.out.print(val+" ");
	}
}