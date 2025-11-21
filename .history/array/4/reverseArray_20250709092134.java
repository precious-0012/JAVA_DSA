import java.util.*;
public class reverseArray{
    static int[] reverseArrayUsingAnotherArray(int[] arr){
        int j=0;
        int[] ans = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            ans[j++]=arr[i];  //arr[j++] = first when we write j++ its working with old value after that statement its updated
        }
        return ans;
    }
    
    static void reverseArrayWithoutUsingAnotherArray(int[] arr){
        int j=0;
        int temp;
        for(int i=arr.length-1;i>j;i--){
            temp=arr[j];
            arr[j++]=arr[i];
            arr[i]=temp;
        }
    }
    
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
    
}
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the "+n+" element of array");
        for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();
        int[] ans = reverseArray.reverseArrayUsingAnotherArray(arr);
        reverseArray.printArray(ans);
        reverseArray.reverseArrayWithoutUsingAnotherArray(arr);
        reverseArray.printArray(arr);
        
    }
}