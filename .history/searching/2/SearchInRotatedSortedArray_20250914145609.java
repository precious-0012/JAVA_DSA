public class SearchInRotatedSortedArray
{
    static int search(int[] arr,int target){
        int n=arr.length;
        int start=0,end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(arr[mid]<arr[end]){
                if(target>arr[mid] && target<=arr[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(target>=arr[start] && target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }    
	public static void main(String[] args) {
		int[] arr={6,7,8,1,2,3,4,5};
		int target=8;
		System.out.print(search(arr,target));
	}
} 