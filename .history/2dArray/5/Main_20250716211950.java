import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problems{
    static void reverseArrayList(ArrayList<Integer> arr){
        int i=0,j=arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> arr = new ArrayList<>();
	    Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
	    while(i!=-1){
	        arr.add(i);
	        i = sc.nextInt();
	    }
	    System.out.println("Original list "+arr);
	   // problems.reverseArrayList(arr);
	   
	    Collections.reverse(arr);
	    System.out.println("Reversed list"+arr);
	    Collections.sort(arr);
	    System.out.println("Ascending order "+arr);
	    Collections.reverse(arr);
        System.out.println("Discending order "+arr);
        
        ArrayList<String> l = new ArrayList<>();
        l.add("Welcome");
        l.add("To");
        l.add("Physics");
        l.add("Wallah");
        System.out.println("OG "+l);
        Collections.sort(l);
        Collections.reverse(l);
        System.out.println("Sorted "+l);
	}	    
}