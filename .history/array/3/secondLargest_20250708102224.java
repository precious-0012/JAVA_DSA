import java.util.*;
public class secondLargest{
    static int findMax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    static int findSecondMax(int[] arr){
        int max = findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max) arr[i]=Integer.MIN_VALUE;
        }
        int secondMax=findMax(arr);
        return secondMax;
    }    
}

class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size");
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    System.out.println("Enter your "+n+" element");
	    for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();
	    int ans = secondLargest.findSecondMax(arr);
	    System.out.println("unique number is "+ans);
	}
}