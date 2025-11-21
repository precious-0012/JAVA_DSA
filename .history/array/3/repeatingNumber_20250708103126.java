import java.util.*;
public class repeatingNumber{
    static int repeatingFirstNumber(int[] arr){
        int ans=0;
        boolean check=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    ans=arr[i];
                    check=true;
                    break;
                }
            }
            if(check==true) break;
        }
        return ans;
    }  
}

class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size");
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    System.out.println("Enter your "+n+" element");
	    for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();
	    int ans = repeatingNumber.repeatingFirstNumber(arr);
	    System.out.println("first repeating number. is "+ans);
	}
}