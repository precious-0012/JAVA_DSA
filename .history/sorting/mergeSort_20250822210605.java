public class mergeSort
{
    static void sort(int[] arr,int l,int mid,int r){
        int n1 = mid-l+1;       
        int n2 = r-mid;      

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0;i<n1;i++) left[i] = arr[l+i];
        for(int i=0;i<n2;i++) right[i] = arr[mid+1+i];

        int i=0,j=0,k=l;  

        while(i<n1 && j<n2){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        while(i<n1) arr[k++] = left[i++];
        while(j<n2) arr[k++] = right[j++];
    }

    static void MergeSort(int[] arr,int l,int r){
        if(l==r) return;
        int mid = (l+r)/2;
        MergeSort(arr,l,mid);     
        MergeSort(arr,mid+1,r);   
        sort(arr,l,mid,r);        
    }

    public static void main(String[] args){
        int[] arr = {4,2,5,7,1,8};
        MergeSort(arr,0,5);
        for(int val:arr) System.out.print(val+" ");
    }
}
 