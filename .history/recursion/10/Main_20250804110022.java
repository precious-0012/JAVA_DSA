public class Main
{
    static int best(int[] h,int idx,int n){
        if(n==idx) return 0;
        int opt1 = Math.abs(h[idx]-h[idx+1]) + best(h,idx+1,n);
        if(idx==n-1) return opt1;
        int opt2 = Math.abs(h[idx]-h[idx+2]) + best(h,idx+2,n);
        return Math.min(opt1,opt2);
    }
	public static void main(String[] args) {
	    int[] h = {10,30,40,20};
	    System.out.println(best(h,0,h.length-1));
 	}
}