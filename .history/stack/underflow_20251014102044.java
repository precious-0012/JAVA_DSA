import java.util.*;
public class underflow
{	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //When we try to perform a pop() or peek() operation on an empty stack,it is known as Stack Underflow.
        while(true) st.pop();
	}
}