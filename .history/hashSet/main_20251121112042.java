import java.util.*;
public class longestConsecutiveSequence
{
	public static void main(String[] args) {
		int[] nums = {100,4,200,1,3,2};
		HashSet<Integer> h = new HashSet<>();
		for(int v : nums) h.add(v);
		int currLen = 0 , maxLen = 0;
		for(int v : h){
		    if(!h.contains(v-1)){ //v is the starting point of the sequence
		        int l = 0;
		        while(h.contains(v+l)){ //this loop runs n times in worst case so tc is c + n = O(n)
		            currLen++;
		            l++;
		        }      
		        maxLen = Math.max(maxLen,currLen);
		    }
		    currLen = 0;
		}
        System.out.println(maxLen);
	}
}