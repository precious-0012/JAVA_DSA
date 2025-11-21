public class dutchNationalFlag
{
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sort(int[] arr){
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
	public static void main(String[] args) {
	    int[] arr={1,0,2,1,1,0,2,0,2,0,1};
	    sort(arr);
	    for(int val: arr) System.out.print(val+" ");
	}
}
// (0 - low-1) = 0
// (low - mid-1) = 1
// (mid - high) = unknown
// (high+1 - n-1) = 2
// We shift the element form mid - high region to another regions and make mid-high region known
// TC = o(n) and single pass