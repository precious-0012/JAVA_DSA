import java.util.*;
public class hashMapBasics
{
	public static void main(String[] args) {
		//Syntax
		Map<String,Integer> m = new HashMap<>();
		//Adding Elements
		m.put("Akash",21);
		m.put("Yash",16);
		m.put("Lav",17);
		m.put("Rishika",19);
		m.put("herry",18);
		//Getting value of a key from the hashMap
		System.out.println(m.get("Yash")); //16
		System.out.println(m.get("Rehan")); //null (bcz key doesn't exist)
		//Updating a value of the key
		m.put("Yash",22);  //key will be unique no duplicate will make
		System.out.println(m.get("Yash"));
		//Remove a pair from the hashMap
		System.out.println(m.remove("Yash")); // delete and return the value if exist
		System.out.println(m.remove("Rehan")); //null bcz key doesn't exist
		//Checking key is exist in hashMap
		System.out.println(m.containsKey("Akash")); //true
		System.out.println(m.containsKey("Yash")); //false
		//Adding a new entry if the new key doesn't exist already
		//if(!m.containsKey("Vedu")) m.put("Vedu",13);
		m.putIfAbsent("Vedu",13);
		//Get all the keys in the hashMap
		System.out.println(m.keySet());
		//Get all the values in the hashMap
		System.out.println(m.values());
		//Get all the entries in the hashMap
		System.out.println(m.entrySet());
		//Traverse all the entries of the hashMap - Multiple methods
		for(String s : m.keySet()) System.out.println("Age of "+s+" is "+m.get(s));
		System.out.println();
		for(Map.Entry<String,Integer> p : m.entrySet()) System.out.println("Age of "+p.getKey()+" is "+p.getValue());
	}
}