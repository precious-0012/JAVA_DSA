public class student{
   String name;
   private int roll_No; //roll_no is private so it's not accessable outside the class
   int cgpa;
   String section;
   int getter(){     //if we want to allow the accessbility of private data so we use getter
      return roll_No;
   }
}
