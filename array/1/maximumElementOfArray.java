import java.util.Scanner;
public class maximumElementOfArray{
    void max(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int a = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>a){
                a=arr[i];
            }
        }
        System.out.println("Maximum element in array is "+a);
        sc.close();
    }
}
class Main{
    public static void main(String[] args) {
        maximumElementOfArray m = new maximumElementOfArray();
        m.max();
    }
}
