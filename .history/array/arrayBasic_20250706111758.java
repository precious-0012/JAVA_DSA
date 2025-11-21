import java.util.Scanner;
public class arrayBasic{
    void _1DArray(){
        int[] ages; 
        ages[0] = 19;  //initialize
        ages[1] = 23;
        ages[2] = 20;
        String[] names = {"Anmol","Rahul","Anuj"}; //2nd way of declaration + initailization = Array literal
        System.out.println(ages[0]+" "+names[0]);
        System.out.println(ages[1]+" "+names[1]);
        System.out.println(ages[2]+" "+names[2]);
        //We noticed that we are doing repetative task so we can use loops
        Scanner sc = new Scanner(System.in);
        float[] weight = new float[3];
        for(int i=0;i<weight.length;i++){
            weight[i] = sc.nextFloat();
        }
        for(int i=0;i<weight.length;i++){
            System.out.println(weight[i]);
        }
     }
}
class Main{
    public static void main(String[] args){
        arrayBasic arr = new arrayBasic();
        arr._1DArray();
    }
}
