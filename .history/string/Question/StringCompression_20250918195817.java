public class StringCompression
{
	public static void main(String[] args) {
	    String s = "aaabbbbcdddeef";
	    int count=1;
	    StringBuilder sb = new StringBuilder();
	    for(int i=1;i<s.length();i++){
	        if(s.charAt(i-1)==s.charAt(i)){
	            count++;
	        }else{
	            sb.append(s.charAt(i-1));
	            if(count>1) sb.append(count);
	            count=1;
	        }
	    }
	    sb.append(s.charAt(s.length()-1));
	    if(count>1) sb.append(count);
	    System.out.println(sb);
	    
	}
}