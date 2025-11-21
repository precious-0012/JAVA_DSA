public class ReverseEachWord
{
	public static void main(String[] args) {
	    String s = "I am an coder";
	    StringBuilder sb1 = new StringBuilder();
	    StringBuilder sb2 = new StringBuilder();
	    for(int i=0;i<=s.length();i++){
	        if(i!=s.length() && s.charAt(i)!=' '){
	            sb1.append(s.charAt(i));
	        }else{
	            sb2.append(sb1.reverse()).append(" ");
	            sb1=new StringBuilder();
	        }
	    }
	    s=sb2+"";
	    System.out.println(s.trim()); //trim remove space before and after string
	}
}