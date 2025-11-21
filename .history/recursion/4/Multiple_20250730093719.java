public class Multiple{
    static void mul(int n,int k){
        //base Work
        if(k==0){
            System.out.println(n);
            return;
        }
        //recursive work
        mul(n,k-1);
        //self work
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        mul(2,4);
    }
}