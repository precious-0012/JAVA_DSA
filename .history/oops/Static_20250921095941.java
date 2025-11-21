public class Static {
    String name;
    int rno;
    static int noOfStudent;
    public Static(String name, int rno) {
        this.name = name;
        this.rno = rno;
        noOfStudent++;
    }
    public static void main(String[] args) {
        Static s1 = new Static("Anmol", 1);
        Static s2 = new Static("Rahul")
    }
}
