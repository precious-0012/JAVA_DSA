public class Static {
    String name;
    int rno;
    static int noOfStudent;  //It's working like shared variable for object
    public Static(String name, int rno) {
        this.name = name;
        this.rno = rno;
        noOfStudent++;
    }
    public static void main(String[] args) {
        Static s1 = new Static("Anmol", 1);
        Static s2 = new Static("Rahul",2);
        System.out.println(noOfStudent);
    }
}
//actually for static variables functions 
