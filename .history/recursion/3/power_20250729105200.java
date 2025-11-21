public class power
{
    static int pow(int p,int q){ //p^q
        //base case
        if(q==0) return 1;
        //self work and recursive work
        return p*pow(p,q-1);
    }
    
    static int pow2(int p,int q){
        //base case
        if(q==0) return 1;
        
        if(q%2==0){
            return pow2(p,q/2) * pow2(p,q/2);
        }else{
            return pow2(p,q/2) * pow2(p,q/2) * p;
        }
    }
	public static void main(String[] args) {
		System.out.println(pow2(2,4));
	}
}