import java.util.*;
public class deletionInStack
{
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int idx = 3;
        Stack<Integer> rt = new Stack<>();
        while(st.size()>idx+1){
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()!=0){
            st.push(rt.pop());
        }
        System.out.println(st);
	}
}