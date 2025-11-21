public class sumOfDigit {
    public static void main(String[] args) {
        int num=12345;
        int sum=0;
        while(num!=0){
            sum+=num%10;
            sum/=10;
        }
        System.out.println();
    }
}
