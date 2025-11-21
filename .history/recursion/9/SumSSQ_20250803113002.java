public class SumSSQ
{
    static void sumSSQ(int[] arr,int s,int idx,int sum){ //abc ,""
        //base case 
        if(s==idx){
            System.out.print(sum+" ");
            return;
        }
        //recursive work
        sumSSQ(arr,s+1,idx,sum+arr[s]); 
        sumSSQ(arr,s+1,idx,sum); 
    }
	public static void main(String[] args) {
	    int[] arr={2,4,5};
		sumSSQ(arr,0,arr.length,0);
	}
}