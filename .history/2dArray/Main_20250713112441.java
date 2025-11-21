import java.util.*;
class pascalMatrix{
    
    static void printArray(int[][] arr){ 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static int[][] pascal(int n){
        int[][] ans = new int[n][];
        for(int i=0;i<n;i++){
            //ith row has i+1 column
            ans[i] = new int[i+1];
            
            //first and last element of every row is 1;
            ans[i][0] = ans[i][i] = 1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }
    
}
class Main{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size");
    int n = sc.nextInt();
    int[][] pasc = pascalMatrix.pascal(n);
    System.out.println("Pacal Matrix");
    pascalMatrix.printArray(pasc);
    }
    //property = 1st and last element are 1 , ith row have i+1 column and inner element is the sum of it's upper and sideupper sum
}