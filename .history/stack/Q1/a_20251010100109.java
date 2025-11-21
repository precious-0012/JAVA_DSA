import java.util.*;
public class question
{
    public static void insertAtbottom(Stack<Integer> st,int ele){
        if(st.size()==0){ //base case and inner work will done by recurssion
            st.push(ele);
            return;
        }
        int peek = st.pop(); //my/self work 
        insertAtbottom(st,ele); //recurrsion work
        st.push(peek);
    }
    public static void reverseStack(Stack<Integer> st){
        if(st.size()==0) return;
        int peek = st.pop();
        reverseStack(st);
        insertAtbottom(st,peek);
    }
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        reverseStack(st);
        System.out.println(st);
	}
}