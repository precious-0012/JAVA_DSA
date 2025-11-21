import java.util.*;
class twoSum{
    public static int[] twoSum(int[] nums, int target) {
        //Ap1=O(n^2)
        // int[] ans = {-1};
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             ans = new int[]{i,j};
        //             return ans;
        //         }
        //     }
        // }
        // return ans;
        //Ap2=O(n)
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] ans = {-1};
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int n = target - nums[i];
            if(m.containsKey(n) && m.get(n)!=i){
                ans = new int[]{i,m.get(n)};
                return ans;
            }
        }
        return ans;
    }
    public static void main (String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] ans = twoSum(nums,target);
        System.out.println("["+ans[0]+" "+ans[1]+"]");
    }
}