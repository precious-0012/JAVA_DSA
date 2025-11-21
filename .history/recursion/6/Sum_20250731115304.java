public class Sum
{
    static int sum(int[]arr,int idx){
        //base case
        if(idx==-1) return 0;
        //recursive work and self work
        return arr[idx] + sum(arr,idx-1);
    }
    
	public static void main(String[] args) {
	    int[] arr={4,5,7,3};
	    System.out.println(sum(arr,arr.length-1));
	}
}
