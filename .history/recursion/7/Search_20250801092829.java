n
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