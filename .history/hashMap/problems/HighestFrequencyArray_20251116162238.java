import java.util.*;
public class HighestFrequencyArray
{
	public static void main(String[] args) {
		int[] arr= {1,3,2,1,4,1};
		//basic Approach - O(nlogn)
		//Arrays.sort(arr);
		//int cnt = 1 , maxCnt = 0;
		//for(int i=0;i<arr.length-1;i++){
		//    if(arr[i]==arr[i+1])cnt++;
		//    else{
		//        if(cnt>maxCnt) maxCnt = cnt;
		//        cnt = 1;
		//    }
		//}
		//System.out.println(maxCnt);
		
		//using hashmap - O(n) - this way is much better than frequency array because it's not space optimized and for storing the negative element frequency it also fails
		Map<Integer,Integer> fm = new HashMap<>();
		for(int i : arr){
		    if(fm.containsKey(i)){
		        //int freq = fm.get(i);
		        //fm.put(i,++freq); //freq++ give wrong result bcz it first return/use the value then incremented the value of freq so hashmap value did not incremented
		        fm.put(i,fm.get(i)+1);
		        
		    }
		    else{
		      fm.put(i,1);  
		    }
		}
		System.out.println("Frequency Map: "+fm.entrySet());
		int max = 0;
		for(int v : fm.values()) if(v>max) max = v;
		System.out.println("highest frequency of a key is "+max);
	}
}











