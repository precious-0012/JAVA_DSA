public class factorial {
    public static void main(String[] args) {
        int fact=8;
        int value=1;
        for(int i=1;i<=fact;i++){
            value*=i;
        }
        System.out.println("The value of "+fact+" is"value);
    }
}
