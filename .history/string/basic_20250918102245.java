import java.util.*;
public class basic
{
	public static void main(String[] args) {
	   //String str = "Laptop";
	   //System.out.println(str);
	   Scanner sc = new Scanner(System.in);
	   //String s= sc.next(); //did not read after space
	   //System.out.println(s);
	   //String s = sc.nextLine(); //read fully
	   //System.out.println(s);
	   //String str = "hello";
	   //System.out.println(str.length());
	   //System.out.println(str.charAt(2));
	   //System.out.println(str.indexOf('l'));
	   //String gtr = "dello";
	   //System.out.println(str.compareTo(gtr));
	   String str = "hey Hii";
	   //all values should be in string 
	   //System.out.println(str.contains("hii")); 
	   //System.out.println(str.startsWith("he"));
	   //System.out.println(str.endsWith("i"));
	   //here changes will not happen in str bcz String is immutable so new memory area will be formed for this 
	   System.out.println(str.toUpperCase());
	   System.out.println(str.toLowerCase());
	}
}