public class logicalOperator{
    public static void main(String[] args){
        int p=15,q=10,r=5;
        System.out.println((p>q) && (p>r));
        System.out.println((p>q) && (p<r));
        System.out.println((r<q) || (p<q));
        System.out.println((p>q) && (q>r));

    }
}