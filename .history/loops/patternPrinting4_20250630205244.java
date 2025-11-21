import java.util.Scanner;
public class patternPrinting4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(k==1||k==2*i-1||i==n){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
}
