import java.util.*;
public class reverseStack
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
        //Iterative Method
        // Stack<Integer> rt = new Stack<>();
        // Stack<Integer> gt = new Stack<>();
        // Stack<Integer> pt = new Stack<>();
        // while(st.size()!=0) rt.push(st.pop());
        // while(rt.size()!=0) gt.push(rt.pop());
        // while(gt.size()!=0) st.push(gt.pop());
        // System.out.println(st);
        reverseStack(st);
	}
}