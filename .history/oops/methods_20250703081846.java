public class methods{
    static int add(int a,int b){
        return a+b;
    }
}

class Main{
    public static void main(String[] args){
        int sum = methods.add(2,3); //
        System.out.println(sum);
    }
}
