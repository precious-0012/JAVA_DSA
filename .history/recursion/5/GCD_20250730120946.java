public class GCD{
    static int igcd(int x,int y){
       //long divison approach
        while(x%y!=0){
            int rem = x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    static int gcd(int x,int y){
        if(y==0) return x;
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        System.out.println(gcd(6,36));
    }
}