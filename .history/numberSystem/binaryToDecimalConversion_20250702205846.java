public class binaryToDecimalConversion {
    public static void main(String[] args) {
        int bin = 1001;
        int dec = 0;
        int pow = 1;
        int store;
        while(bin>0){
            store=bin%10;
            pow*=2;
            pow*=2;
            pow*=2;
            dec+=store*pow;
            bin/=10;
        }
        System.out.println(dec);
    }
}
