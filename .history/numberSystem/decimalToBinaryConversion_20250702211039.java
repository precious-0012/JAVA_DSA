public class decimalToBinaryConversion{
    public static void main(String[] args){
        int dec = 15;
        int bin = 0;
        int pow = 1;
        while(dec>0){
            bin+=dec%2*pow;
            pow*=10;
            dec/=2;
        }
        System.out.println(bin);
    }
}