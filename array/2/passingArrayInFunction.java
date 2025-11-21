public class passingArrayInFunction{
    static void changeArray(int[] arr){
        arr[0]=0;
        arr[1]=0;
        arr[2]=0;
    }
    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
}
class Main{
    public static void main (String[] args) {
        int[] arr = {5,6,7};
        passingArrayInFunction.changeArray(arr);
        passingArrayInFunction.PrintArray(arr);
        
        
    }
}
