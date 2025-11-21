import mainPa.student;  
public class fillDetail{
        public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Anmol";
        s1.roll_No = 12323397;
        s1.cgpa = 8;
        s1.section = "K23LL";
        System.out.println("Student name is "+s1.name);
        System.out.println("Student roll_no is "+s1.roll_No);
        System.out.println("Student cgpa is "+s1.cgpa);
        System.out.println("Student section is "+s1.section);


    }
}
