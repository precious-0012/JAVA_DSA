import java.util.*; 
public class postfixEvaluation
{
	public static void main(String[] args) {
	    String postfix = "953+4*6/-";
	    Stack<Integer> val = new Stack<>();
	    int length = postfix.length();
	    for(int i=0;i<length;i++){
	        char ch = postfix.charAt(i);
	        int ascii = (int) ch;
	        if(ascii>=48 && ascii<=58) val.push(ascii-48);
	        else{
	            int v2 = val.pop();
	            int v1 = val.pop();
	            if(ch=='+') val.push(v1+v2); 
	            if(ch=='-') val.push(v1-v2); 
	            if(ch=='*') val.push(v1*v2); 
	            if(ch=='/') val.push(v1/v2); 
	        }
	    }
	    System.out.println(val.peek());
	}
}
