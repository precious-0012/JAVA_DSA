public class countNumber{
    public static void main(String[] args) {
        int num=12345;
        int sum=0;
        while(num!=0){
            num/=10;
            sum++;
        }
        System.out.println(sum);
    }
}
