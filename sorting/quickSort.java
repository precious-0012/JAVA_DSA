public class quickSort
{
    static void swap(int[] arr,int st,int pivIdx){
        int temp=arr[pivIdx];
        arr[pivIdx]=arr[st];
        arr[st]=temp;
    }
    static int partition(int[]arr,int st,int end){
        int pivot=arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++) if(arr[i]<=pivot) count++; 
        int pivIdx=st+count;
        swap(arr,st,pivIdx);
        int i=st,j=end;
        while(i<pivIdx && j>pivIdx){
            while(arr[i]<=arr[pivIdx]) i++;
            while(arr[j]>arr[pivIdx]) j--;
            if(arr[i]>arr[pivIdx] && arr[j]<arr[pivIdx]){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivIdx;
    }
    static void quickSort(int[] arr,int st,int end){
        if(st>=end) return;
        int pivIdx=partition(arr,st,end);
        quickSort(arr,st,pivIdx-1);
        quickSort(arr,pivIdx+1,end);
    }
	public static void main(String[] args) {
		int[] arr={3,1,7,4,9,8,2};
		int end=arr.length-1;
		quickSort(arr,0,end);
		for(int n:arr) System.out.print(n+" ");
	}
}