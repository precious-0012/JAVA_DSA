import java.util.*;
public class insertionInStack
{
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx = 3;
        int x = 11;
        if(st.size()<idx){
            System.out.println("Wrong Input");
            return;
        }
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()!=0){
            st.push(temp.pop());
        }
        System.out.println(st);
	}
}