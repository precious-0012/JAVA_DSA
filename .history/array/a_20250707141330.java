import java.util.*;
public class largestSmallestElementOfArray{
    static int[] largestSmallestElement(int[] arr){
        Arrays.sort(arr); 
        int[] ans = new int[2];
        ans[0] = arr[0];
        ans[1] = arr[arr.length-1];
        return ans;
    }
}
class Main
{
	public static void main(String[] args) {
		int[] arr = {5,6,7,4,3,5,8,9};
		int[] ans = largestSmallestElementOfArray.largestSmallestElement(arr);
		System.out.print(ans[0]+" "+ans[1]);
	}
}