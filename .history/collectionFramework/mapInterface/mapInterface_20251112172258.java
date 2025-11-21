import java.util.*;
public class mapInterface
{
    public static void HashMapLinkedHashMapExample(){ 
        //Map<Integer,String> m = new HashMap<>(); //Unordered + unique key
        LinkedHashMap<Integer,String> m = new LinkedHashMap<>(); //InsertionOrdered
        m.put(2,"Anya");
        m.put(1,"Adi");
        m.put(3,"Renu");
        m.put(4,"heena");
        m.put(48,"Sohan");
        //m.put(1,"Saru"); //Over-ride
        m.putIfAbsent(1,"Saru"); //Nothings happen bcz key 1 is present
        System.out.println(m); //{key-value}
        System.out.println(m.entrySet()); //[key-value]
        System.out.println(m.get(2));
        System.out.println(m.containsKey(0));
        System.out.println(m.containsValue("Anya"));
        System.out.println(m.keySet());
        System.out.println(m.values());
        //Iterate over key in a Map
        for(int i: m.keySet()){
            System.out.print(i+" ");
        }
        System.out.println();
        //Iterate over values in a Map
        //var can store any dataType
        for(var v: m.values()){
            System.out.print(v+" ");
        }
        System.out.println();
        //Iterate over key-value in a Map
        for(var kv: m.entrySet()){
            System.out.print(kv+" ");
        }
        System.out.println();
        for(var kv: m.entrySet()){
            System.out.print(kv.getKey()+" "); //same for value (getValue)
        }
    }
    public static void TreeMapExample(){
        TreeMap<Integer,String> tm = new TreeMap<>(); //sortedInKe
        tm.put(2,"Anya");
        tm.put(1,"Adi");
        tm.put(3,"Renu");
        tm.put(4,"heena");
        tm.put(48,"Sohan");
        //tm.put(1,"Saru"); //Over-ride
        tm.putIfAbsent(1,"Saru"); //Nothings happen bcz key 1 is present
        System.out.println(tm); //{key-value}
        System.out.println(tm.entrySet()); //[key-value]
        System.out.println(tm.get(2));
        System.out.println(tm.containsKey(0));
        System.out.println(tm.containsValue("Anya"));
        System.out.println(tm.keySet());
        System.out.println(tm.values());
        //Iterate over key in a Map
        for(int i: tm.keySet()){
            System.out.print(i+" ");
        }
        System.out.println();
        //Iterate over values in a Map
        //var can store any dataType
        for(var v: tm.values()){
            System.out.print(v+" ");
        }
        System.out.println();
        //Iterate over key-value in a Map
        for(var kv: tm.entrySet()){
            System.out.print(kv+" ");
        }
        System.out.println();
        for(var kv: tm.entrySet()){
            System.out.print(kv.getKey()+" "); //same for value (getValue)
        }
    }
	public static void main(String[] args) {
    	HashMapLinkedHashMapExample();
	}
}