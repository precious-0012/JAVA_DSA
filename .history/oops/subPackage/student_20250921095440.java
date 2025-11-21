public class student{
   String name;
   private int roll_No = 19; //roll_no is private so it's not accessable outside the class
   int cgpa;
   String section;
   int getRno(){     //if we want to allow the accessbility of get private data so we use getter
      return roll_No;
   }
   void setRno(int val){ //if we want to allow the accessbility of update the private data so we use settter
      roll_No = val;
   }
}
