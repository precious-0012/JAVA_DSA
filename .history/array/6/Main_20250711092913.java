import java.util.*;
public class prefixSum{
    
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
    
    static int[] makePrifixSumArray(int[] arr){
        //by extra space
        // int[] pref=new int[arr.length];
        // pref[0]=arr[0];
        // for(int i=1;i<arr.length;i++) pref[i]=pref[i-1]+arr[i];
        // return pref;
        //optimised way to save SC 
        for(int i=1;i<arr.length;i++) arr[i]+=arr[i-1];
        return arr;
    }
    
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the size of array: ");
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    System.out.println("Enter the "+n+" elements");
        for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
        int[] pref = prefixSum.makePrifixSumArray(arr);
        prefixSum.printArray(pref);
        
       
	}
}