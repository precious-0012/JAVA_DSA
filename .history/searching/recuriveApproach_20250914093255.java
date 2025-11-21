public class recuriveApproach
{
    static boolean binarySearch(int[] arr,int start,int end,int target){
        if(start>end) return false;
        int mid=;
        if(arr[mid]==target){
            return true;
        }else if(arr[mid]>target){
            return binarySearch(arr,start,mid-1,target);
        }else{
            return binarySearch(arr,mid+1,end,target);
        }
    }
	public static void main(String[] args) {
		int[] arr={6,8,10,11,13,20};
		int n =arr.length;
		int target=1;
		System.out.print(binarySearch(arr,0,n-1,target));
	}
}