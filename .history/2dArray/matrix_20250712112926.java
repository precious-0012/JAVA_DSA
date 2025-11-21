import java.util.*;
public class matrix{
    static int[] size(int r,int c){
        int[] arr = {r,c};
        return arr;
    }
    static int[][] inputMultidimensionalArray(){
        int a=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix "+a++);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c]; 
        System.out.println("Enter the "+r*c+" elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    static void add(int[][] a,int[][] b){
        int r1 = a.length;
        int c1 = a[0].length;
        int r2 = b.length;
        int c2 = b[0].length;
        if(r1!=r2 ||c1!=c2){ //first check then allocate memory
            System.out.println("Wrong Input - Addition not possible");
            return; //it stops the execution
        }
        int[][] sum = new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of matrix 1 and matrix 2");
        printArray(sum);
    }
    static void multiply(int[][] a,int[][] b){
        //better for understanding
        int r1 = a.length;
        int c1 = a[0].length;
        int r2 = b.length;
        int c2 = b[0].length;
        if(c1!=r2){
            System.out.println("Wrong Input - Multiplication cannot possible");
            return;
        }
        int[][] mul = new int[r1][c2];
        //We runs this loop according to mul array dimension
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Muliplication of 2 matrices ");
        printArray(mul);
        
    }
    
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
        int[][] matrix1 = matrix.inputMultidimensionalArray();
        int[][] matrix2 = matrix.inputMultidimensionalArray();
                //In order to addition of matrix dimensions should be equal if first one is 2*3 then other one should also be 2*3 demension

        // matrix.add(matrix1,matrix2);
        //if we have 2 matrix r1*c1 and r2*c2 so c1 and r2 should be equal for multiplication and new matrix will be the dimension of r1*c2
        matrix.multiply(matrix1,matrix2);
        
    }
}