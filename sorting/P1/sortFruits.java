public class sortFruits
{
    static void SelectionSort(String[] fruits){
        int n = fruits.length;
        for(int i=0;i<n-1;i++){
            String min = fruits[i];
            int idx = i;
            for(int j=i+1;j<n;j++){
                if(min.compareTo(fruits[j])>0){
                    min=fruits[j];
                    idx=j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[idx];
            fruits[idx] = temp;
        }
    }
	public static void main(String[] args) {
	    String[] fruits = {"kiwi","apple","papaya","mango"};
	    SelectionSort(fruits);
	    for(int i=0;i<fruits.length;i++) System.out.print(fruits[i]+" ");
	}
}