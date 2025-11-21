public class radixSort
{
    static int findMax(int[] arr){
        int max=arr[0];           
        for(int i=0;i<arr.length;i++) if(max<arr[i]) max=arr[i]; 
        return max;
    }
    static void CountSort(int[] arr,int place){
        int  n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10];
        for(int i=0;i<n;i++) count[(arr[i]/place)%10]++;
        for(int i=1;i<count.length;i++) count[i]+=count[i-1];
        int idx=0;
        for(int i=n-1;i>=0;i--){
            idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        } 
        for(int i=0;i<n;i++) arr[i]=output[i];

    }
    static void RadixSort(int[] arr){
        int max=findMax(arr);
        int place=1;
        while(max>0){
            CountSort(arr,place);
            max/=10;
            place*=10;
        }
    }
	public static void main(String[] args) {
		int[]arr={4,2,5,6,8,1};
		RadixSort(arr);
        for(int val:arr) System.out.print(val+" ");
	}
}