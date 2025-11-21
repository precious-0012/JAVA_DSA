import java.util.*;
public class rotateArray{
    static int[] RotateArray(int[] arr,int k){
        int n=arr.length;
        k = k%10;
        int j=0;
        int[] ans = new int[n];
        for(int i=n-k;i<n;i++) ans[j++]=arr[i];
        for(int i=0;i<n-k;i++) ans[j++]=arr[i];
        return ans;
    }
    static void printArray(int[] ans){
        for(int i=0;i<ans.length;i++) System.out.print(ans[i]+" ");
    }
    static void reverseArray(int[] arr,int a,int n){
        int j = n-1;
        for(int i=a;i<j;i++){
            int temp=arr[j];
            arr[j--]=arr[i];
            arr[i]=temp;
        }
    }
    static void rotateArrayWithoutExtraSpace(int[] arr,int k){
        int n = arr.length;
        k=k%10;
        reverseArray(arr,0,n-k);
        reverseArray(arr,n-k,n);
        reverseArray(arr,0,n);
    }
}
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the "+n+" elements");
        for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        // int[] ans = rotateArray.RotateArray(arr,k);
        // rotateArray.printArray(ans);
        rotateArray.rotateArrayWithoutExtraSpace(arr,k);
        rotateArray.printArray(arr);
    }
}