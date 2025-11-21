import java.util.*;
public class rectangleSum{
    static void findPrefixSum(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        } 
        
        //for calculating the prefix sum of column 
        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]+=matrix[i-1][j];
            }
        } 
    }
    static void findSum(int[][] matrix,int l1,int r1,int l2,int r2){
        //this approch is good only for single query , In case of multiple query this approch is worst
        //If taken multiple query then TC = O(n^3)
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=matrix[i][j];
            }
        }
        System.out.println("Rectangle Sum "+sum);
    }
    
    static void findSum2(int[][] matrix,int l1,int r1,int l2,int r2){
        //If taken multiple query then TC = O(n^2)
        findPrefixSum(matrix);
        int sum=0;
        for(int i=l1;i<=l2;i++){
            if(r1>0){
                sum+=matrix[i][r2]-matrix[i][r1-1];
            }else{
                sum+=matrix[i][r2];
            }    
        }
        System.out.println("Rectangle Sum "+sum);
    }
    
    static void findSum3(int[][] matrix,int l1,int r1,int l2,int r2){
        //If taken multiple query then TC = O(n)
        findPrefixSum(matrix);
        //This way takes less number of calculations in compare to ifElse 
        int ans,sum = 0,up = 0,left = 0,upleft = 0;
        sum = matrix[l2][r2];
        if(l1>0){
            up = matrix[l1-1][r2];
        }
        
        if(r1>0){
            left = matrix[l2][r1-1];
        }
        
        if(l1>0 && r1>0){
            upleft = matrix[l1-1][r1-1];
        }
        
        ans = sum - left - up + upleft;
        System.out.println("Rectangle Sum "+ans);
    }
}
class Main{
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
        System.out.println("Enter the range of l1 and r1");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.println("Enter the range of l2 and r2");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        rectangleSum.findSum3(matrix,l1,r1,l2,r2);
    }
}