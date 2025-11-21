public class fibonacci{
    static int fib(int n){
        //base Case
        if(n==0) return 0;
        if(n==1) return 1;
        //recursive work (+ = self work)
        return fib(n-1) + fib(n-2);
    }
}
class Main{
    public static void main(String[] args){
        for (int i=0;i <10; i++) {
            
        }
        System.out.println(fibonacci.fib(6));
    }
}