import java.util.*;
public class prefixToInfix
{
	public static void main(String[] args) {
		String s = "-9/*+5346"; 
		Stack<String> val = new Stack<>();
		int length = s.length();
		for(int i=length-1;i>=0;i--){
		    char ch = s.charAt(i);
		    int ascii = (int) ch;
		    if(ascii>=48 && ascii<=57) val.push(ch+"");
		    else{
		        String v1 = val.pop();
		        String v2 = val.pop();
		        char op = ch;
		        val.push('('+v1+op+v2+')');
		    }
		}
		System.out.println(val.peek());
		
	}
}