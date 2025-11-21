public class PeakElement
{
    static int searchPeek(int[] arr){
        int n=arr.length;
        int start=0,end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((mid==0 || arr[mid-1]<arr[mid]) && (mid==n-1 ||arr[mid]>arr[mid+1])){ //mid==0 means arr[mid-1]<arr[mid] so dont need to check arr[mid-1]<arr[mid] and if mid==n-1 so dont need to check arr[mid]>arr[mid+1] bcz before 0 and n-1 there is -inf and we use this bcz we want to avoid array index of bound
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
		int[] arr={1,2,3,2,1,2, 3};
		System.out.print(searchPeek(arr));
	}	
}
//mulitple peaks exist
//arr[-1]=-inf && arr[n]=-inf
//peak element is greater than its neighbours
//num[i]!=num[i+1]
	
