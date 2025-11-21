public class ObjectPassInFunction
{
    String name;
    static void change(ObjectPassInFunction s){
        s.name = "Ritik";
    }
    public static void main (String[] args) {
        ObjectPassInFunction s = new ObjectPassInFunction();
        s.name = "Anmol";
        change(s);
        System.out.println(s.name);
    }
    //So object is passing value of Reference
}