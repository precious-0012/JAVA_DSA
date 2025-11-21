import java.util.Scanner;
public class arrayBasic{
    void multiArray(){
        int[][] arr = new int[3][2]; 
        // int[][] arrLiteral = {{2,3},{5,3},{9,4}};
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = obj.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
        obj.close();

    }
    void _1DArray(){
        int[] ages; //declare
        ages = new int[3]; //memory allocation
        ages[0] = 19;  //initialize
        ages[1] = 23;
        ages[2] = 20;
        String[] names = {"Anmol","Rahul","Anuj"}; //2nd way of declaration + initailization = Array literal
        System.out.println(ages[0]+" "+names[0]);
        System.out.println(ages[1]+" "+names[1]);
        System.out.println(ages[2]+" "+names[2]);
        //We noticed that we are doing repetative task so we can use loops       
        for(float weight : weights) System.out.print(weight+" ");

        sc.close();
     }
}
class Main{
    public static void main(String[] args){
        arrayBasic arr = new arrayBasic();
        arr._1DArray();
        // arr.multiArray();
    }
}
