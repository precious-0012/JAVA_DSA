import java.util.*;
public class printSpiral{
    static void printArray(int[][] arr){ 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static int[][] generateSpiralMatrix(int n){
        int[][] matrix = new int[n][n];
        int topRow = 0,bottomRow = n-1,leftColumn = 0 ,rightColumn = n-1;
        int curr = 1;
        while(curr<=n*n){
            for(int i=leftColumn;i<=rightColumn && curr<=n*n;i++){
                matrix[topRow][i] = curr++;
            }
            topRow++;
            
            for(int i=topRow;i<=bottomRow && curr<=n*n;i++){
                matrix[i][rightColumn] = curr++;
            }
            rightColumn--;
            
            
            for(int i=rightColumn;i>=leftColumn && curr<=n*n;i--){
                matrix[bottomRow][i] = curr++;
            }
            bottomRow--;
            
            for(int i=bottomRow;i>=topRow && curr<=n*n;i--){
                matrix[i][leftColumn] = curr++;
            }
            leftColumn++;
        }
        return matrix;
        
    }
    
    static void printSpiralOrder(int[][] matrix,int r,int c){
        int topRow = 0,bottomRow = r-1,leftColumn = 0 ,rightColumn = c-1;
        int totalElement = 0;
        while(totalElement<r*c){
            //topRow = leftColumn to rightColumn
            for(int i=leftColumn;i<=rightColumn && totalElement<=r*c;i++){
                System.out.print(matrix[topRow][i]+" ");
                totalElement++;
            }
            topRow++;
            
            //rightColumn = topRow to bottomRow
            for(int i=topRow;i<=bottomRow && totalElement<=r*c;i++){
                System.out.print(matrix[i][rightColumn]+" ");
                totalElement++;
            }
            rightColumn--;
            
            
            //bottomRow = rightColumn to leftColumn
            for(int i=rightColumn;i>=leftColumn && totalElement<=r*c;i--){
                System.out.print(matrix[bottomRow][i]+" ");
                totalElement++;
            }
            bottomRow--;
            
            //leftColumn = bottomRow to topRow
            for(int i=bottomRow;i>=topRow && totalElement<=r*c;i--){
                System.out.print(matrix[i][leftColumn]+" ");
                totalElement++;
            }
            leftColumn++;
        }
        
    }
}
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number of rows: ");
        // int r = sc.nextInt();
        // System.out.print("Enter number of columns: ");
        // int c = sc.nextInt();
        // int[][] matrix = new int[r][c]; 
        // System.out.println("Enter the "+r*c+" elements");
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }
        // printSpiral.printSpiralOrder(matrix,r,c);
        System.out.print("Enter the size of matrix ");
        int n = sc.nextInt();
        int[][] spiralMatrix = printSpiral.generateSpiralMatrix(n);
        printSpiral.printArray(spiralMatrix);
        
    }    
}