public class Main
{
    static void printSSQ(String s,String subs){ //abc ,""
        //base case 
        if(s.length()==0){
            System.out.println(subs);
            return;
        }
        //recursive work
        //choose to be part of substring
        printSSQ(s.substring(1),subs + s.charAt(0)); //include bc , a
        //choose not to be part of substring
        printSSQ(s.substring(1),subs); //exclude bc , ""
    }
	public static void main(String[] args) {
		printSSQ("abc"," ");
	}
}