import java.util.*;
public class largestSubarrayWith0Sum
{
	public static void main(String[] args) {
		int[] nums = {1,1,2,3,1,2,3,-12-1};
		HashMap<Integer,Integer> im = new HashMap<>();
		int ps=0,ml=0;
		im.put(0,-1); //If the sum of whole array is 0
		for(int i=0;i<nums.length;i++){
		    ps+=nums[i];
		    if(im.containsKey(ps)) ml = Math.max(ml,i-im.get(ps));
		    im.putIfAbsent(ps,i);
		} 
	}
}