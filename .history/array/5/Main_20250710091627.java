import java.util.*;
class sortArray{
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