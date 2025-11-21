public class FrogJump
{
    static int minCost(int[] arr,int idx,int n){
        //base case
        if(idx==n) return 0;
        if(idx==n-1) return arr[idx+1];
        //recursive work with self work
        int a = Math.abs(arr[idx]-arr[idx+1]) + minCost(arr,idx+1,n);
        int b = Math.abs(arr[idx]-arr[idx+2]) + minCost(arr,idx+2,n);
        return Math.min(a,b);
    }
	public static void main(String[] args) {
	    int[] arr={10,30,20,40};
		System.out.println(minCost(arr,0,arr.length-1));
	}
}