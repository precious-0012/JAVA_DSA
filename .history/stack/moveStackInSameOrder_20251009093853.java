import java.util.*;
public class moveStackInSameOrder
{
	public static void main(String[] args) {
	    //Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		//System.out.println("Enter the Number of element you want to insert");
		//int n = sc.nextInt();
		//System.out.println("Enter the elements: ");
		//while(n!=0){
		//    st.push(sc.nextInt());
		//    n--;
		//}
		//System.out.println(st);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		//reverse Order
		Stack<Integer> gt = new Stack<>();
		while(st.size()!=0){
		    gt.push(st.pop()); //2 works add element and remove
		}
		System.out.println(gt);
		//System.out.println(st);
		//same Order
		Stack<Integer> rt = new Stack<>();
		while(gt.size()!=0){
		    rt.push(gt.pop()); 
		}
		System.out.println(rt);
		//System.out.println(gt);
	}
}
//TC = O(n)