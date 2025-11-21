public class sqrt
{
    static int Sqrt(int y){
        int start=0,end=y;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==y){
                return mid;
            }else if(mid*mid>y){
                end=mid-1;
            }else{
                start=mid+1;
                ans=mid;
            }
        }
    return ans; 
    }
	public static void main(String[] args) {
		int y=25;
		System.out.print(Sqrt(y));
	}
}