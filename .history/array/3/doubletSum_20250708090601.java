import java.util.*;
public class doubletSum{
    static int pairSum(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(target==arr[i]+arr[j]){
                    count++;
                }
            }
        } 
        return count;
    }
}

class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size");
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    System.out.println("Enter the target element");
	    int target = sc.nextInt();
	    System.out.println("Enter your "+n+" element");
	    for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();
	    int ans = doubletSum.pairSum(arr,target);
	    System.out.println("Total number pair is "+ans);
	}
}