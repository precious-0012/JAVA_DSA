import java.util.ArrayList;
import java.util.Collections;
public class bucketSort
{
    static void BucketSort(float[] arr){
        int n = arr.length;
        ArrayList<Float>[] buckets = new ArrayList[n];
        for(int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
        }
        for(int i=0;i<n;i++){
            int bucketIdx=(int) (arr[i]*n);
            buckets[bucketIdx].add(arr[i]);
        }
        for(int i=0;i<n;i++){
            Collections.sort(buckets[i]);
        }
        int k=0;
        for(int i=0;i<buckets.length;i++){
            for(int j=0;j<buckets[i].size();j++){
                arr[k++]=buckets[i].get(j);
            }
        }
    }
	public static void main(String[] args) {
		float[] arr={0.5f,0.4f,0.3f,0.2f,0.1f};
		BucketSort(arr);
        for(float val:arr) System.out.print(val+" ");
	}
}