public class RaceTrack
{
    static boolean isPossible(int[] a,int k,int dist){
        int kidsPlaced=1;
        int lastKid=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-lastKid>=dist){
                kidsPlaced++;
                lastKid=a[i];
            }
        }
        return kidsPlaced>=k;
    }
    static int MaximumMinima(int[] a,int k){
        if(k>a.length) return -1;
        int ans=0,st=1,end=(int) 1e9;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isPossible(a,k,mid)){
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		int[] a={1,2,4,8,9};
		int k=3;
		System.out.println(MaximumMinima(a,k));
	}
}
//tc=O(nlogN