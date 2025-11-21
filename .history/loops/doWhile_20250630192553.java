
import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n;
        while(n!=-1){
            n=sc.nextInt();
            sum+=n;
        }
        System.out.println(sum);
    }
}
