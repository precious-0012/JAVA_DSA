class arrayShallowCopy{
    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
}
public class Main{
    public static void main (String[] args) {
        int[] arr = {5,6,7,8,9};
        System.out.println("Original arr");
        arrayShallowCopy.PrintArray(arr);
        int[] arr_2 = arr;
        System.out.println("Copied arr_2");
        arrayShallowCopy.PrintArray(arr_2);
        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.println("Original array after changing arr_2");
        arrayShallowCopy.PrintArray(arr);
        System.out.println("Copied array after changing");
        arrayShallowCopy.PrintArray(arr_2);
    }
}