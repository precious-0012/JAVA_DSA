import java.util.*;
public class rangeQuery{

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
    
    static void makePrifixSumArray(int[] arr){
        for(int i=1;i<arr.length;i++) arr[i]+=arr[i-1];
    }
    
}
class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the size of array: ");
	    int n=sc.nextInt();
	    int[] arr=new int[n+1];
	    System.out.println("Enter the "+n+" elements");
        for(int i=1;i<=n;i++) arr[i]=sc.nextInt(); //1-based index
        rangeQuery.makePrifixSumArray(arr);
        System.out.print("Enter number of queries: ");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter ranges ");
            int l=sc.nextInt();
            int r=sc.nextInt();
            System.out.println("Sum of range is "+(arr[r]-arr[l-1]));
        }
        //In this question i can use a loop inside while loop and run from l to r with storing sum but here TC IS O(n^2) but here TC is O(n);
       
	}
}