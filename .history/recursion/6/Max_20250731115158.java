public class Max
{
    static int max(int[]arr,int idx){
        //base case
        if(ind==0) return arr[0];
        //recursive work
        int ans = max(arr,ind-1);
        //self work
        return Math.max(ans,arr[ind]);
    }
        
    
	public static void main(String[] args) {
	    int[] arr={3,10,3,2,5};
	    System.out.println(max(arr,arr.length-1));
	}
} 
    
