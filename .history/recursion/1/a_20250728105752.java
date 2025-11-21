public class Factorial{
    static int f(int n){
        //base Case
        if(n==0) return 0;
        if(n==1) return 1;
        //recursive work (+ = self work)
        return f(n-1) + f(n-2);
    }
}
class Main{
    public static void main(String[] args){
        System.out.println(Factorial.f(6));
    }
}