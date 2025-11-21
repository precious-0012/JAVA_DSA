public class FrogJump
{
    static int minCost(int[] arr,int idx,int n){
        if(idx==n) return 0;
        int opt1 = Math.abs(arr[idx]-arr[idx+1]) + minCost(arr,idx+1,n);
        if(idx==n-1) return opt1;
        int opt2 = Math.abs(arr[idx]-arr[idx+2]) + minCost(arr,idx+2,n);
        return Math.min(opt1,b);
    }
	public static void main(String[] args) {
	    int[] arr={10,30,20,40};
		System.out.println(minCost(arr,0,arr.length-1));
	}
}