public class RemoveA
{
    static String removeA(String s,int idx){
        //base case
        if(idx==-1) return "";
        //recursive work
        String ans = removeA(s,idx-1);
        //self work
        if(s.charAt(idx)!='a') ans+=s.charAt(idx);
        return ans;
    }
	public static void main(String[] args) {
	    String s = "dnanya yua";
		System.out.println(removeA(s,s.length()-1));
	}
}   