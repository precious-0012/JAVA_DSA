public class binaryToDecimalConversion {
    public static void main(String[] args) {
        int bin = 1001;
        int dec = 0;
        int pow = 1;
        while(bin>0){
            dec+=bin%10*pow;
            bin/=10;
            pow*=2;
        }
        System.out.println(dec);
    }
}
