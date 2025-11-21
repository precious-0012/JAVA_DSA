import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		h.add("James");
		h.add("Scot");
		h.add("James");
		System.out.println(h);
		System.out.println(h.contains("James")); //true
		System.out.println(h.size()); //2
		h.remove("James");
		System.out.println(h.contains("James"));
		h.add("Mark");
		
		//Traverse on HashSet
		for(String v : h) System.out.print(v+" "); //var v can also be used 
	}
}