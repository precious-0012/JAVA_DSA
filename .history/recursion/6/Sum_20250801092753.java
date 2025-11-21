public class Sum
{
    static int sum(int[]arr,int idx){
        //base case
        if(idx==-1) return 0;
        //recursive work and self work
        return arr[idx] + sum(arr,idx-1);
    }

public class Search
{
    static String search(int[] arr,int target,int idx){
        if(idx==-1) return "No";
        String p = search(arr,target,idx-1);
        if(p=="Yes" || arr[idx]==target){
            return "Yes";
        }else{
            return "No";
        }
    }
	public static void main(String[] args) {
	    int[] arr={1,-2,3,4,5};
	    int tar = -2;
	    int n = arr.length-1;
		System.out.println(search(arr,tar,n));
	}
}
    	public static void main(String[] args) {
	    int[] arr={4,5,7,3};
	    System.out.println(sum(arr,arr.length-1));
	}
}
