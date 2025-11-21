
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int pow=1;
        for(int i=1;i<=m;i++){
            pow*=n;
        }
        System.out.println("Power of "+n+" raised to "+b+" is "+n);
    }
}
