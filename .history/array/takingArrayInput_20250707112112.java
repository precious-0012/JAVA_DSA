import java.util.Scanner;
public class takingArrayInput{
    static void InputArrayArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the "+size+" element");
        for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }   

}
class Main{
    public static void main(String[] args) {
        takingArrayInput.InputArray();
        
    }
}
