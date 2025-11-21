public class methods{
    static int add(int a,int b){  //it's static method , so we can call it directly by class name no need to create 
        return a+b;
    }
}

class Main{
    public static void main(String[] args){
        int sum = methods.add(2,3); 
        System.out.println(sum);
    }
}
