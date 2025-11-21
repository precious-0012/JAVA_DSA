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
        //difference between for loop and while loop
        //while loop is used when we don't need any extra variable instead of condition whereas for loop is used when we need extra variable
    }
}
