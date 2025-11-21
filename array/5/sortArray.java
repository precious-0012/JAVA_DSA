import java.util.*;
public class sortArray{
    static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
    static void sortZeroesAndOnes(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0) left++;
            if(arr[right]==1) right--;
        }
    }
    static void sortArrayByParity(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                right--;
                left++;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
    static int[] sortSquares(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int[] ans=new int[n];
        int k=n-1;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--]=arr[left]*arr[left];
                left++;
            }else{
                ans[k--]=arr[right]*arr[right];
                right--;
            }
        }
        
        return ans;
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
        for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
        // sortArray.sortZeroesAndOnes(arr);
        // sortArray.printArray(arr);
        // sortArray.sortArrayByParity(arr);
        // sortArray.printArray(arr);
        //In this question we can solve the first question by counting the no of zeroes and then filled the array by 0 relatively and remaining with ones but For better TC and understanding the concept of two pointers we do it by that way and 2nd question also
	    int[] ans=sortArray.sortSquares(arr);
	    sortArray.printArray(ans);
	}
}