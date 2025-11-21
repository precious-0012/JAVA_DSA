class arrayBasic{
    void _1DArray(){
        int[] ages = new int[3];
        ages[0] = 19;
        ages[1] = 23;
        ages[2] = 20;
        String[] names = {"Anmol","Rahul","Anuj"};
        System.out.println(ages[0]+" "+names[0]);
        System.out.println(ages[1]+" "+names[1]);
        System.out.println(ages[2]+" "+names[2]);
     }
}
public class Main{
    public static void main(String[] args){
        arrayBasic arr = new arrayBasic();
        arr._1DArray();
    }
}
