public class Max
{
    static int max(int[]arr,int idx){
        //base case
        if(idx==0) return arr[0];
        //recursive work
        int ans = max(arr,idx-1);
        //self work
        return Math.max(ans,arr[idx]);
    }
        
    
	public static void main(String[] args) {
	    int[] arr={3,10,3,2,5};
	    System.out.println(max(arr,arr.length-1));
	}
} 
    
