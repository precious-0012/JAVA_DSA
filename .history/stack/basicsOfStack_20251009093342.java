import java.util.Stack;
public class basicsOfStack
{
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		System.out.println(st.isEmpty());
		System.out.println(st);
		st.push(1);
		st.push(23);
		st.push(90);
		st.push(5);
		st.push(34);
		System.out.println(st.peek());
		System.out.println(st);
		//st.pop();
		//S.out.println(st);
		//st.pop();
		//System.out.println(st);
		System.out.println(st.size());
		while(st.size()!=1){
		    st.pop();
		}
		System.out.println(st.peek());
		System.out.println(st);
	}
}
//Built in stack