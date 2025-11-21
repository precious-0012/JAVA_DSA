import java.util.*;
class multidimensionalArray{
    static void printArray(int[][] arr){ 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class Main{
    public static void main (String[] args) {
        // int[][] arr=new int[4][3]; 
        // int[][] arr_2={{1,2,3},{4,5,6},{7,8,9}};
        // multidimensionalArray.printArray(arr_2);
         
        //Taking 2dArray user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c]; //rows/main array size mandatory to give whereas column/inner array size not mandatory
        System.out.println("Enter the "+r*c+" elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        multidimensionalArray.printArray(arr);
        
    }
}