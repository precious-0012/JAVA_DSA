import java.util.*;
public class subarraySumEqualToK{
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int s = 0, p = 0;
        h.put(0,1);
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(h.containsKey(s-k)) p+=h.get(s-k);
            if(h.containsKey(s)) h.put(s,h.get(s)+1); //storing freu
            else h.put(s,1);
        }
        return p;
    }
    public static void main (String[] args) {
        int[] nums = {1,-1,0};
        int k = 0;
        System.out.println(subarraySum(nums,k));
    }
}