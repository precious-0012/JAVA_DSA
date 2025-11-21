import java.util.*;
public class Search
{
    static ArrayList<Integer> AllIndices(int[] arr,int target,int idx){
        ArrayList<Integer> ans = new ArrayList<>();
        //base case
        if(idx==-1) return ans;
        //recusive work
        ans = AllIndices(arr,target,idx-1);
        //self work
        if(arr[idx]==target){
            ans.add(idx);
        }
        return ans;
    }
    
    static void findAllIndices(int[] arr,int target,int idx){
        //base case
        if(idx==-1) return;
        //recusive work
        findAllIndices(arr,target,idx-1);
        //self work
        if(arr[idx]==target) System.out.print(idx+" ");
    }
    
    static int findIndex(int[] arr,int target,int idx){ //1 -2 3 4   tar = 3;
        //base case
        if(idx==-1) return -1;
        //recusive work
        int index = findIndex(arr,target,idx-1); //1 -2 3
        //self work
        if(index!=-1){
            return index;
        }else if(arr[idx]==target){
            return idx;
        }else{
            return -1;
        }  
    }
    
    static String search(int[] arr,int target,int idx){
        //base case
        if(idx==-1) return "No";
        //recursive work
        String p = search(arr,target,idx-1);
        //self work
        if(p=="Yes" || arr[idx]==target){
            return "Yes";
        }else{
            return "No";
        }
    }
	public static void main(String[] args) {
	    int[] arr={1,4,3,4,6};
	    int tar=4;
	    int n = arr.length-1;
// 		System.out.println(search(arr,tar,n));
        System.out.println(AllIndices(arr,tar,n));
	}
}