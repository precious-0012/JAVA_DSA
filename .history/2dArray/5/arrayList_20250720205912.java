import java.util.ArrayList;
public class arrayList{
    static void wrapperClass(){
        // Integer i = Integer.valueOf(2);
        // Float f = Float.valueOf(4.5f);
        // System.out.println(i+" "+f);
    }
    
    static void makeArrayList(){
        //Declaration
        ArrayList<Integer> arr = new ArrayList<>(); //in second angular bracet it's take value of wrapper class defaultly
        
        //add new element
        arr.add(2);
        arr.add(5); 
        arr.add(8);
        arr.add(1);
        arr.add(4);
        
        //get an element at index i
        System.out.println(arr.get(3));
        
        //print with for loop
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        
        //printing the arrayList directly
        System.out.println(arr);
        
        //adding element at some index i
        arr.add(2,1g00);
        System.out.println(arr);
        
        //modifying element at some index i
        arr.set(0,10);
        System.out.println(arr);
        
        //removing element at index i
        arr.remove(4);
        System.out.println(arr);
        
        //removing an element e
        arr.remove(Integer.valueOf(5)); //this method return boolean 
        System.out.println(arr);
        
        //checking if an element exist
        Boolean ans = arr.contains(Integer.valueOf(8));  //this method also return boolean 
        System.out.println(ans);
        
        //if you don't specify class ,you can put anything inside it
        // ArrayList l = new ArrayList();
        // l.add("hello");
        // l.add(123);
        // l.add(4.66);
        // System.out.println(l);
        
    }
}
class Main
{
	public static void main(String[] args) {
	    arrayList.makeArrayList();
	}
}