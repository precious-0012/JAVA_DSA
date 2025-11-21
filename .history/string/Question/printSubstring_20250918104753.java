import java.util.*;
public class printSubstring
{
	public static void main(String[] args) {
	   String str = "abcd";
	   for(int i=0;i<str.length();i++){
	       for(int j=i;j<=str.length();j++){
	           System.out.print(str.substring(i,j)+" ");
	       }
	   } 
	}
}