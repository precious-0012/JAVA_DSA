import java.util.*;
public class GetSSQ
{
    static ArrayList<String> getSSQ(String s,int idx){
        ArrayList<String> ans = new ArrayList<>();
        //base Case
        if(idx==-1){
            ans.add("");
            return ans;
        }
        //recursive work
        ArrayList<String> smallAns = getSSQ(s,idx-1);
        //self work
        for(int i=0;i<smallAns.size();i++){
            ans.add(smallAns.get(i) + s.charAt(idx));
        }
        ans.addAll(smallAns);
        return ans;
    }
	public static void main(String[] args) {
	    String s = "abc";
		System.out.println(getSSQ(s,s.length()-1));
	}
}