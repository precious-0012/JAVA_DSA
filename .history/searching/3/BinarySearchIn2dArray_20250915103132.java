public class BinarySearchIn2dArray
{
    static boolean search(int[][] arr,int target){
        int n=arr.length,m=arr[0].length;
        int start=0,end=n*m-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int midElt=arr[mid/m][mid%m];
            if(midElt==target){
                return true;
            }else if(midElt>target){
                end=mid-1;
            }else{
                start=mid+1;
            }   
        }
        return false;
    }
	public static void main(String[] args) {
		int[][] arr={{1,3,5,7},{8,10,11,12},{15,16,17,20}};
		int target=3;
		System.out.print(search(arr,target));
	}
}
//