import java.util.*;
public class mostNumberOfElementAtOnceOnTable
{
	public static void main(String[] args) {
		int[] arr = {2,1,4,1,3,2,3,4};
		HashSet<Integer> h = new HashSet<>();
		int max_size = 0;
		for(int i=0;i<arr.length;i++){
		    if(h.contains(arr[i])) h.remove(arr[i]);
		    else{
		        h.add(arr[i]);
		        max_size = Math.max(max_size,h.size());
		    }
		}
		System.out.println(max_size);
	}
}