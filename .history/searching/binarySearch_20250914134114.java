public class binarySearch
{
    static boolean BinarySearch(int[] arr,int target){
        int start=0,end=arr.length-1;
        while(start<=end){//that means we check every space between start and end with las
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		int[] arr={6,8,10,11,13,20};
		int target=1;
		System.out.print(BinarySearch(arr,target));
	}
}