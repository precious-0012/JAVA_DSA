public class binaryToDecimalConversion {
    public static void main(String[] args) {
        int bin = 1111;
        int dec = 0;
        int pow = 1;
        int store;
        while(bin>0){
            // store=bin%10;
            dec+=bin%10*pow;
            bin/=10;
            pow*=2;
        }
        System.out.println(dec);
    }
}
