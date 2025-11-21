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
//actually for static variables and functions different memory is used which is method area therefore it's worked like shared variable and accessble by class bcz class also stored in method area
//sometime we think obj store in heap so how it access the static so its like syntactic sugar means when we write obj.staticVar it converted in className.sta
