import java.util.*;
public class presentQuery{
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100001];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
}
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the "+n+" elements");
        for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
        int[] freq=presentQuery.makeFrequencyArray(arr);
        System.out.print("Enter the value of q: ");
        int q = sc.nextInt();
        int i=0;
        while(q>0){
            System.out.print("Enter the query"+i+++": ");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            q--;
        }
    }
    //In this code, I use frequency array for saving the time complexivity ,In normal search i will use nexted loop of TC 
}