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
        sortArray.sortZeroesAndOnes(arr);
        sortArray.printArray(arr);
        //We can normally do that question by counting the number of zeroes and then pass all zeroes to array and remains from 1 but it takes to iteration, So for better TC and For understanding the two pointer approach w
	}
}