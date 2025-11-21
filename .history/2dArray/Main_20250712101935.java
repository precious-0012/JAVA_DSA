import java.util.*;
class matrix{
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
        if(a.length!=b.length || a[0].length!=b[0].length){ //first check then allocate memory
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
        matrix.add(matrix1,matrix2);
        
    }
}