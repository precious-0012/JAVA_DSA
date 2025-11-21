import java.util.*;
public class postfixToInfix
{
	public static void main(String[] args) {
		String s = "953+4*6/-"; 
		Stack<String> val = new Stack<>();
		int length = s.length();
		for(int i=0;i<length;i++){
		    char ch = s.charAt(i);
		    int ascii = (int) ch;
		    if(ascii>=48 && ascii<=57) val.push(ch+"");
		    else{
		        String v2 = val.pop();
		        String v1 = val.pop();
		        char op = ch;
		        val.push('('+v1+op+v2+')');
		    }
		}
		System.out.println(val.peek());
		
	}
}