import java.util.*;
class transposeMatrix{
public class transposeMatrix{
    
    static void printArray(int[][] arr){ 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void swap(int[][] matrix,int i,int j){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
    static int[][] transposeinPlace(int[][] transpose,int c,int r){
        //Only applicable for square matrices
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
               swap(transpose,i,j);
            }
        }
        return transpose;
    }
    
    static int[][] findTranspose(int[][] matrix,int r,int c){
        int[][] transpose = new int[c][r];  //if matrix is 3*3 so ans is 3*3 if it's 2*3 then transpose matrix will be form in 3*2
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        return transpose;
    }
}
class Main{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows and columns of matrix");
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] matrix = new int[r][c]; 
    System.out.println("Enter the "+r*c+" elements");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    // int[][] transpose = transposeMatrix.findTranspose(matrix,r,c);
    // System.out.println("Transpose of a Matrix");
    // transposeMatrix.printArray(transpose);
    
    int[][] transpose = transposeMatrix.transposeinPlace(matrix,r,c);
    System.out.println("Transpose of Matrix");
    transposeMatrix.printArray(transpose);
    }
}