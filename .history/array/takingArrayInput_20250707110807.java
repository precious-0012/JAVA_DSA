import java.util.Scanner;
public class takingArrayInput{
    static void ArrayInput(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            
        }
    }   

}
class Main{
    public static void main(String[] args) {
        takingArrayInput.ArrayInput();
    }
}
