public class twoUnsortElement
{
    static void sort(int[] arr){
        int x=-1,y=-1,n=arr.length;
        if(n==1) return;  //for handle the edge case if single element came.
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if(x<0){
                    x=i-1;
                    y=i;
                }else{
                    y=i;
                }
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp; 
    }
	public static void main(String[] args) {
        int[] arr={1,9,3,4,5,8,2};
        sort(arr);
        for(int val:arr) System.out.print(val+" ");
	}
}