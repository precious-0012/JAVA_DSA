public class ount
{
    static int count(int n){
        //base case
        if(n==0) return 0;
        //self work and recursion work
        return 1 + count(n/10);
    }
	public static void main(String[] args) {
		System.out.println(count(2347889));
	}
}