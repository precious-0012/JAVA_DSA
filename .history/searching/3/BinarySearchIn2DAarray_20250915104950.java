public class BinarySearchIn2DArray
{
    static boolean search(int[][] arr,int target){
        int n=arr.length,m=arr[0].length;
        int i=0,j=m-1;
        while(i<n && j>=0){
            if(arr[i][j]==target){
                return true;
            }else if(arr[i][j]<target){
                i++;
            }else{
                j--;
            }   
        }
        return false;
    }
	public static void main(String[] args) {
		int[][] arr={{1,3,5,7},{8,10,11,12},{15,16,17,20}};
		int target=13;
		System.out.print(search(arr,target));
	}
	//row = left-right sorted
	//column = up to down sorted
    //tc = o(n+m)	
}