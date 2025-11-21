public class _continue {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
        //continue keyword is used to skip current iteration of loop
    }
}
