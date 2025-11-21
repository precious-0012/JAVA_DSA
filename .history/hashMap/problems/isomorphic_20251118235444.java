import java.util.*;
class Main{
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> rm = new HashMap<>();
        HashSet<Character> ev = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!rm.containsKey(s.charAt(i))){
                if(ev.contains(t.charAt(i))) return false;  //containsValue(); = O(n)
                else{
                    rm.put(s.charAt(i),t.charAt(i));
                    ev.add(t.charAt(i));
                }    
            }    
            else{
                if(rm.get(s.charAt(i))!=t.charAt(i)) return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        System.out.println(isIsomorphic("egg","lee"));
    }
}