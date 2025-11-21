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
        int left;;
        int right=n-1;
        for(left=0;left<right;left++){
            if(arr[left]>arr[right]){
                swap(arr,left,right);
                right--;
            }else{
                right--;
            }
        }
    }
    static void sortArrayByParity(int[] arr){
        int left;
        int right=arr.length-1;
        for(left=0;left<right;left++){
            if(arr[left]%2==0 && arr[right]%2==1){
                right--;
            }else if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                right--;
            }else if(arr[left]%2==0 && arr[right]%2==0){
                continue;
            }else if(arr[left]%2==1 && arr[right]%2==1){
                left--;
                right--;
            }
        }
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
        sortArray.sortArrayByParity(arr);
        sortArray.printArray(arr);
        //In this question we can solve the first question by counting the no of zeroes and then filled the array by 0 relatively and remaining with ones but For better TC and understanding the concept of 
	}
}