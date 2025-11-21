public class To
{
    static StringBuilder toggle(String s){
        StringBuilder str = new StringBuilder(s);
	    for(int i=0;i<str.length();i++){
	        char ch=str.charAt(i);
	        if(ch==' ') continue;
	        int ascii = (int) ch;
	        if(ascii<97){
	            ascii+=32;
	            char c = (char) ascii;
	            str.setCharAt(i,c);
	        }else{
	            ascii-=32;
	            char c = (char) ascii;
	            str.setCharAt(i,c);
	        }
	    }
	    return str;
    }
    static String togglebyString(String str){
	    for(int i=0;i<str.length();i++){
	        char ch=str.charAt(i);
	        if(ch==' ') continue;
	        int ascii = (int) ch;
	        if(ascii<97){
	            ascii+=32;
	            char c = (char) ascii;
	            str=str.substring(0,i)+c+str.substring(i+1);
	        }else{
	            ascii-=32;
	            char c = (char) ascii;
	            str=str.substring(0,i)+c+str.substring(i+1);
	        }
	    }
	    return str;
    }
	public static void main(String[] args) {
	   // System.out.println(toggle("PHYsiCs"));	
	    System.out.println(togglebyString("PHYsiCs"));	
	}
}