public class power
{
    static int pow(int p,int q){ //p^q //TC = O(q)
        //base case
        if(q==0) return 1;
        //self work and recursive work
        return p*pow(p,q-1);
    }
    
    static int pow2(int p,int q){ //TC = O(logq)
        if(q==0) return 1;
        if(q%2==0){
            int smallPow = pow2(p,q/2);
            return smallPow * smallPow;
        }else{
            int smallPow = pow2(p,q/2);
            return smallPow * smallPow * p;
        }
    }
	public static void main(String[] args) {
		System.out.println(pow2(2,4));
	}
} 