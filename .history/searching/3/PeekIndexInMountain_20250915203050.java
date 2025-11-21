public class PeekIndexInMountain
{
    static int searchPeek(int[] arr){
       int n=arr.length;
        int start=1,end=n-2; //0 and n-1 element cannot be the peak bt it can be the mid so thats the problem but it cannot the peak so we dont need to  
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]<arr[mid+1]){
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
// An array is a mountain array if ->
// arr.length>=3
// arr[0]<arr[1]<...<arr[i-1]<arr[i]>arr[i+1]>...>arr[n-2]>arr[n-1]
