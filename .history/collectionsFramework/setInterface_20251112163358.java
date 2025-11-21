import java.util.*;
public class setInterface
{
    public static void HashSetLinkedHashSetExample(){ 
        // HashSet<Integer> hs = new HashSet<>(); //Unordered + Uniqueness(Internally use hashing for uniqueness)
        LinkedHashSet<Integer> hs = new LinkedHashSet<>(); //Ordered + Uniqueness(LinkedList + hashing)
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(15);
        hs.add(48);
        System.out.println(hs);
        hs.add(1);
        hs.add(1);
        hs.add(2);
        hs.remove(2);
        System.out.println(hs);
        System.out.println(hs.contains(2));
        System.out.println(hs.size());
    }
    public static void TreeSetExample(){
        TreeSet<Integer> ts = new TreeSet<>(); //SortedOrdered + Uniqueness(Self-balancing BST(Red-Black Tree))
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(15);
        ts.add(48);
        System.out.println(ts);
        ts.add(1);
        ts.add(1);
        ts.add(2);
        ts.remove(2);
        System.out.println(ts);
        System.out.println(ts.contains(2));
        System.out.println(ts.size());
    }
	public static void main(String[] args) {
    	TreeSetExample();
	}
}