import java.util.*;
public class checkPartitionArray{
    
    static int findArraySum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++) sum+=arr[i];
        return sum;
    }
    static boolean equalSumPartition(int[] arr){
        int n=arr.length;
        int totalSum=findArraySum(arr);
        int prefSum=0;
        for(int i=0;i<n-1;i++){ 
            prefSum+=arr[i];
            int suffixSum=totalSum-prefSum;
            if(prefSum==suffixSum){
                return true;
            }
        }
        return false;
    }
}
class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the size of array: ");
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    System.out.println("Enter the "+n+" elements");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt(); //1-based index
        boolean b = checkPartitionArray.equalSumPartition(arr);
        System.out.println("Equal partition possible: "+b);
	}
}