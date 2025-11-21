import java.util.Scanner;

public class conditonalOperator {
     public static void main(String[] args) {
        int marks = sc.nextInt();

        // Ternary operator to check result
        String result = (marks >= 33) ? "Pass" : "Fail";

        System.out.println("You " + result + " the exam!");
    }
}

