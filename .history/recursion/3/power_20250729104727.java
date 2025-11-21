public class power
{
    //M1
    static int pow(int p,int q){ //p^q  //TC and SC = O(n)
        //base case
        if(q==0) return 1;
        //self work and recursive work
        return p*pow(p,q-1);
    }
    //M2
    static int pow2()
	public static void main(String[] args) {
		// System.out.println(pow(2,2));

	}
}