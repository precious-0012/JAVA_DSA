public class firstOccurence
{
    static int BinarySearch(int[] arr,int target){
        int start=0,end=arr.length-1;
        int idx=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                idx=mid;
                end=mid-1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return idx;
    }
	public static void main(String[] args) {
		int[] arr={4,4,4,5,5,5,5,6,6,8,10,11,13,20};
		int target=4;
		System.out.print(BinarySearch(arr,target));
	}
}