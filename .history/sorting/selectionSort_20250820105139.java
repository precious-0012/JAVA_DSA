public class SelectionSort
{
    static void selectionSort(int[] a){
        int n = a.length;
        for(int i=0;i<n-1;i++){
            int min = a[i];
            int idx = i;
            for(int j=i+1;j<n;j++){
                if(min>a[j]){
                    min=a[j];
                    idx=j;
                }
            }
            int temp = a[i];
            a[i] = min;
            a[idx] = temp;
        }
    }
	public static void main(String[] args) {
	    int[] a = {7,6,5,2,1};
	    selectionSort(a);
	    for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
	}
}