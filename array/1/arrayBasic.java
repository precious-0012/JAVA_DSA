public class arrayBasic{
    void multiArray(){
        int[][] arr = new int[3][2]; 
        // int[][] arrLiteral = {{2,3},{5,3},{9,4}};
        arr[0][0]  = 3;
        arr[0][1]  = 4;
        arr[1][0]  = 6;
        arr[1][1]  = 9;
        arr[2][0]  = 8;
        arr[2][1]  = 1;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }

    }
    void _1DArray(){
        int[] ages; //declare
        ages = new int[3]; //memory allocation
        ages[0] = 19;  //initialize
        ages[1] = 23;
        ages[2] = 20;
        String[] names = {"Anmol","Rahul","Anuj"}; //2nd way of declaration + initailization = Array literal
        // System.out.println(ages[0]+" "+names[0]);
        // System.out.println(ages[1]+" "+names[1]);
        // System.out.println(ages[2]+" "+names[2]);

        //We noticed that we are doing repetative task so we can use loops to print the array
        for(int i=0;i<names.length;i++) System.out.print(names[i]+" ");
        System.out.println();
        for(int age : ages) System.out.print(age+" ");

     }
}
class Main{
    public static void main(String[] args){
        arrayBasic arr = new arrayBasic();
        arr._1DArray();
        // arr.multiArray();
    }
}
