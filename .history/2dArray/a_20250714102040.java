import java.util.*;
class printSpiral{
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
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c]; 
        System.out.println("Enter the "+r*c+" elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        printSpiral.printSpiralOrder(matrix,r,c);
    }    
}