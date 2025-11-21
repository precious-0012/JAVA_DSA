import java.util.*;
public class tripletSum{
    static int pairSum(int[] arr,int target){
        int count=0;
        int l = 3; //this variable 
        for(int i=0;i<=arr.length-l;i++){
            for(int j=i+1;j<=arr.length-l+1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(target==arr[i]+arr[j]+arr[k]){
                        count++;
                    }
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
	    int ans = tripletSum.pairSum(arr,target);
	    System.out.println("Total number pair is "+ans);
	}
}