package collectionsFramework;
import java.util.*;
public class listInterface
{
    public static void ArrayListLinkedListExample(){
        //ArrayList<Integer> l = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);  
        l.add(4);
        System.out.println(l);
        System.out.println(l.get(1));
        l.remove(3);
        System.out.println(l);
        l.set(1,10); //modify if element exist 
        //if i did l.set(4,10) so it through exception when i call ArrayListExample method 
        System.out.println(l);
        System.out.println(l.contains(10));
        System.out.println(l.size());
        l.clear();
        System.out.println(l);
    }
    public static void StackExample(){
        Stack<String> st = new Stack<>();
        st.push("pw");
        st.push("skils");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.clear();
        System.out.println(st);
        //other methods of list interface also supported
    }
	public static void main(String[] args) {
		//ArrayListLinkedListExample();
		StackExample();
	}
}