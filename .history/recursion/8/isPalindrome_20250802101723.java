public class isPalindrome
{
    static boolean ispalindrome(String s,int l,int r){
        if(l>=r) return true;
        boolean ans = ispalindrome(s,l+1,r-1);
        if(ans==true && s.charAt(l)==s.charAt(r)){
            return true;
        }else{
            return false;
        }
        
    }
	public static void main(String[] args) {
	    String s = "abna";
		System.out.println(ispalindrome(s,0,s.length()-1));
	}
}