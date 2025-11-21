public class print
{
    static void printArray(int[] arr,int idx){ //1 2 3 4
        //base case
        if(idx==-1) return;
        //recursive work
        printArray(arr,idx-1);//1 2 3
        //self work
        System.out.print(arr[idx]+" ");
        
    }
	public static void main(String[] args) {
	    int[] arr={}};
	    printArray(arr,arr.length-1);
	}
}