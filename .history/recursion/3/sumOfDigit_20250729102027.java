public class sumOfDigit
{
    static int sod(int n){ //5123
        //base case 
        if(n>=0 && n<=9) return n;
        
        // recursive work and self work
        return sod(n/10) + n%10;
     }
	public static void main(String[] args) {
		System.out.println(sod(512584));
	}
} 