public class PeekIndextInMountain
{
    static int searchPeek(int[] arr){
        int n=arr.length;
        int start=0,end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid-1]<arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,4,3,2,1};
		System.out.print(searchPeek(arr));
	}
	
}