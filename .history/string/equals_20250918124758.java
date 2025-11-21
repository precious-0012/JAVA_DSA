import java.util.*;
public class equals
{
	public static void main(String[] args) {
	   String s1="hello";
	   String s2="hello";
	   String s3=new String("hello");
	   System.out.println(s1==s2); //true;
	   System.out.println(s1==s3); //false
	   System.out.println(s1.equals(s1)); //true
	   //therefore we need to use .equals
	}
}