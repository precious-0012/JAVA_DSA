public class Reverse
{
    static String reverse(String s,int idx){
        if(idx==-1) return "";
        String ans = s.charAt(idx) + reverse(s,idx-1);
        return ans;
        
    }
	public static void main(String[] args) {
	    String s = "anuj";
		System.out.println(reverse(s,s.length()-1));
	}
} 