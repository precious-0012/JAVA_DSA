    import java.util.*;
class rotateMatrix{
    
    static void printArray(int[][] arr){ 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static void swap(int[] matrix){
        int i=0;
        int j=matrix.length-1;
        while(i<j){
            int temp=matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
            i++;
            j--;
        }
    }
    
    static int[][] rotate(int[][] matrix,int n){
        findTranspose(matrix,n);
        for(int i=0;i<n;i++){
            swap(matrix[i]);
        }
        return matrix;
    }
    
    static void findTranspose(int[][] matrix,int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
class Main{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size");
    int n = sc.nextInt();
    int[][] matrix = new int[n][n]; 
    System.out.println("Enter the "+n*n+" elements");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    //In 90* rotation of 2dArray/matrix is valid for square matrix;
    int[][] rotate = rotateMatrix.rotate(matrix,n);
    System.out.println("Rotated Matrix");
    rotateMatrix.printArray(rotate);
    }
}
}
