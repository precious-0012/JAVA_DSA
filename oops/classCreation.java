//Creating our own data type
public class classCreation{
    String Name;
    int rollno;
    double per;
}
class Main{
    public static void main(String[] args) {
        //Creating variable/object of our data type
        classCreation obj = new classCreation(); //declaration
        //Initialization
        obj.Name = "Raghav"; //dot(.) operator is used to initialize
        obj.rollno = 41;
        obj.per = 81.22;
        System.out.println(obj.Name);
        
        classCreation s2 = new classCreation();
        // s2.Name = "Anushka";  //return null bcz Name feild is empty no value assign for s2
        obj.rollno = 31;
        obj.per = 90.41;
        System.out.println(obj.Name);
        
        //When we make different class so it's preferred to make it separetly and Make main class for the main method
    }    
}