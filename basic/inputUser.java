import java.util.Scanner;
public class inputUser{
    public static void main(String[] args) {
        //Make object 
        Scanner obj = new Scanner(System.in); 
        //Use obj object to call function and take input
        byte b = obj.nextByte(); 
        short s = obj.nextShort();
        int i = obj.nextInt();
        long l = obj.nextLong();
        float f = obj.nextFloat();
        char c = obj.next().charAt(0);
        String sp = obj.next(); //take single string input
        String st = obj.nextLine(); 
        boolean bool = obj.nextBoolean();
        obj.close(); // Close Scanner - ab es object ke through ham koi input nhi le skte
    }
}
