public class bubble
{
    static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag = false; //has any swapping happened
            //Last i elements are already at correct sorted position so no need to check them
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = true; //
                }
            }
        }
        
    }
	public static void main(String[] args) {
	    int[] arr = {2,2,4,5,5,1,0};
		bubbleSort(arr);
		for(int i : arr){
		    System.out.print(i+" ");
		}
	}
}