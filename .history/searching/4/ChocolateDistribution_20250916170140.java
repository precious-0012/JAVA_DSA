public class ChocolateDistribution
{
    static boolean isDivisonPossible(int[] a,int m,int mxChocAllowed){
        int numOfStudent=1;
        int choc=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>mxChocAllowed) return false;
            if(choc+a[i]<=mxChocAllowed){
                choc+=a[i];
            }else{
                numOfStudent++;
                choc=a[i];
            }
        }
        return numOfStudent<=m;
    }
    static int MinimalMaxima(int[] a,int m){
        if(a.length<m) return -1;
        int ans=0,st=1,end=(int)1e9;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isDivisonPossible(a,m,mid)){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		int[] a={5,3,1,4,2};
		int m=3;
		System.out.println(MinimalMaxima(a,m));
	}
}
//tc=O(nlogN)