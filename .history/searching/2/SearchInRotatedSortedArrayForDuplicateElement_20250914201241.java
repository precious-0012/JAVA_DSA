public class SearchInRotatedSortedArrayForDuplicateElement
{
    static int search(int[] arr,int target){
        int n=arr.length;
        int start=0,end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){ //if start=mid=end then we cannnot decide the sortede position so we remove this space
                start++;
                end--;
            }else if(arr[mid]<=arr[end]){ //arr[mid]<arr[end] that means that part is sorted and arr[mid]=arr[end] that means also our array is sorted bcz arr[start]!=arr[mid]
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