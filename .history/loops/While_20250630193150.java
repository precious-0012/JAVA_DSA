import java.util.Scanner;
public class While{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        while(n!=-1){
             sum+=n;
            n=sc.nextInt();
        }
        System.out.println("The sum of streams of input is "+sum);
    }
}
