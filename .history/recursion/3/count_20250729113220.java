public class count
{
    static int count(int n){
        if(n==0) return 0;
        return 1 + count(n/10);
    }
	public static void main(String[] args) {
		System.out.println(count(2347889));
	}
}