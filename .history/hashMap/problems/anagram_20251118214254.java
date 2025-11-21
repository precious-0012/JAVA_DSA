public class anagram{
    public Map<Character, Integer> makeFrequencyMap(String st){
        Map<Character,Integer> fm = new HashMap<>();
        for(int i=0;i<st.length();i++){
            char sc = st.charAt(i);
            if(fm.containsKey(sc)) fm.put(sc,fm.get(sc)+1);
            else fm.put(sc,1);
        }
        return fm;    
    }
    public boolean isAnagram(String s, String t) {
        //Approach 1
        // if(s.length()!=t.length()) return false;
        // Map<Character,Integer> fm1 = makeFrequencyMap(s);
        // Map<Character,Integer> fm2 = makeFrequencyMap(t);
        // return fm1.equals(fm2); //equals() => order of entries doesn't matter
        
        //Approach 2
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> m = makeFrequencyMap(s);
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(m.containsKey(c)){
                m.put(c,m.get(c)-1);
                if(m.get(c)==0) m.remove(c);    
            }
            else return false;    
        }
        
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("keen"));
    }
}