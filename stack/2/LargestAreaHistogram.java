import java.util.Stack;
public class LargestAreaHistogram
{
    public static int[] nse(int[] arr){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int n = arr.length;
        int[] nse = new int[n];
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                nse[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        for(int i=0;i<n;i++) if(nse[i]==0) nse[i] = -1;
        return nse;
    }
    public static int[] pse(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
        return pse;
    }
	public static void main(String[] args) {
		int[] arr = {5,2,4,6,3,5};
		int[] nse = nse(arr);
		int[] pse = pse(arr);
		int n = arr.length;
		int max = 0;
		for(int i=0;i<n;i++) if(nse[i]==-1) nse[i] = n;
		for(int i=0;i<n;i++){
		    int area = arr[i] * (nse[i] - pse[i] - 1);
		    if(max<area) max = area;
		}
		System.out.println(max);
	}
}