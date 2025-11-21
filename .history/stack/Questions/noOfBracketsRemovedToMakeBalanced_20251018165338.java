import java.util.*;
public class noOfBracketsRemovedToMakeBalanced
{
    public static int noBracketsRemoved(String s) {
		Stack<Character> st = new Stack<>();
		int remove = 0;
		for(int i=0;i<s. length();i++){
		    if(s.charAt(i)=='(') st.push('(');
		    else{
		        if(st.size()!=0) st.pop();
		        else remove++;
		    }
		}
		if(st.size()==0) return remove;
		else return remove+st.size();
    }
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
		System.out.print(noBracketsRemoved(s));
	}
}