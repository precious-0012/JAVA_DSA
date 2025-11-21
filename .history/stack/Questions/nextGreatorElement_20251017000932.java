import java.util.*;
public class nextGreatorElement
{
    public static void nextGreatorBruteForce(int[] arr){
        int n = arr.length; 
		for(int i=0;i<n-1;i++){
		    boolean filled = false;
		    for(int j=i+1;j<n;j++){
		        if(arr[j]>arr[i]){
		            arr[i] = arr[j];
		            filled = true;
		            break;
		        }      
		    }
		    if(filled == false) arr[i] = -1;
		}
		arr[n-1] = -1;
    }
    public static int[] nextGreatorByStack(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()!=0 && arr[i]>st.peek()){
                st.pop();
            }
            if(st.size()==0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
	public static void main(String[] args) {
		int[] arr = {4,1,6,7,5,8,2}; //{6,6,7,8,8,-1,-1}
		//nextGreatorBruteForce(arr);
		arr = nextGreatorByStack(arr);
		for(int val:arr) System.out.print(val+" ");
	}	
}
//nextGreatorElement is first element that is greator than the current element after current element
//When any sequence is making and the top element of the sequence use first(LIFO) then i can use stack
//sequ



