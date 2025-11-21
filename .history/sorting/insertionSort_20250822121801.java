public class insertionSort
{
    static void InsertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }
	public static void main(String[] args) {
		int[] a = {6,5,4,3,2};
		insertionSort(a);
		for(int val : a) System.out.print(val+" ");
	}
}