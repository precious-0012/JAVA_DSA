import java.util.*;
public class balancedBrackets
{
    public static boolean isBalanced(String s) {
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='(') st.push('(');
		    else{
		        if(st.size()!=0) st.pop();
		        else{
		            return false;
		        }
		    }
		}
		if(st.size()==0) return true;
		else return false;
    }((((()))))
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
		System.out.println(isBalanced(s));
	}
}
//Last opening bracket will use first = (LIFO) = first out means first it came in use then remove so case like this 