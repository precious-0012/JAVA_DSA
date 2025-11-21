public class 
{
	public static void main(String[] args) {
	    StringBuilder sb = new StringBuilder("abc");
	    int count=0;
	    for(int i=0;i<sb.length();i++){
	        for(int j=i+1;j<=sb.length();j++){
	            String s=sb.substring(i,j);
	            int st=0,ed=j-1-i;
	            boolean flag=true;
	            while(st<=ed){
	                if(s.charAt(st)!=s.charAt(ed)){
	                    flag=false;
	                }
	                st++;
	                ed--;
	            } 
	            if(flag==true) count++;
	        }
	    }
	    System.out.println(count);
	}
}