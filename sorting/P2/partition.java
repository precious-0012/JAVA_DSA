public class partition
{
    static void sort(int[] arr){
        int n=arr.length;
        int i=0,j=n-1;
        //like quick sort partition
        while(i<j){
            while(arr[i]<0) i++;
            while(arr[j]>=0) j--;
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    }
	public static void main(String[] args) {
        int[] arr={19,-20,7,-4,-13,11,-5,3};
        sort(arr);
        for(int val:arr) System.out.print(val+" ");
	}
}