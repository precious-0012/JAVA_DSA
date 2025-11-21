import java.util.Arrays;
class arrayDeepCopy{
    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
}
public class Main{
    public static void main (String[] args) {
        int[] arr = {5,6,7,8,9};
        System.out.println("Original arr");
        arrayDeepCopy.PrintArray(arr);
        // Deep copy functions
        // int[] arr_2 = arr.clone(); //It copied whole array
        // int[] arr_2 = Arrays.copyOf(arr,arr.length); //It copied from starting to last given range
        int[] arr_2 = Arrays.copyOfRange(arr,0,3); //It copied from initial to last given range
        System.out.println("Copied arr_2");
        arrayDeepCopy.PrintArray(arr_2);
        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.println("Original array after changing arr_2");
        arrayDeepCopy.PrintArray(arr);
        System.out.println("Copied array after changing");
        arrayDeepCopy.PrintArray(arr_2);
    }
}