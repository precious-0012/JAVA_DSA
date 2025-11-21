public class constructor {
    String Name;
    int roll;
    double per;
    //Parameterized Constructor
    public constructor(String Name, int roll, double per){
        this.Name = Name;
        this.roll = roll;
        this.per = per;
    }
    //Default Constructor
    public constructor(){

    }
}    

class Main{
    public static void main(String[] args) {
        //Constructor is used to initialize the object
        //pahele ham 3 lines extra likhni padhti thi pr constructor se vo kaam hamara bach jata h
        //Ye jo hamara class name/UserDefinedDataType h ye object bnane ke sath sath function call bhi krta h
        //Agr ham eske andar koi argument na de tb hamara default constructor call hota h jo ki dikhta nhi h agr default constructor na ho tb ham object bhi nhi bna skte aise
        //Jb ham paramerized constructor bnate h tb hamara default constructor hat jta h 
        constructor c1 = new constructor("Anmol",21,87.77);
        System.out.println(c1.Name);
        System.out.println(c1.roll);
        System.out.println(c1.per);
        //Hamne parameterized constructor bnaya h hmara default vla hat gya h to ab agr hamne koi object bnaya aur uske through value pass na kri tb error aa jaega to uske liye ham ek default constructor khud se bna lete h
        constructor c2 = new constructor();
        c2.Name = "Raghav";
        System.out.println(c2.Name);
    }
}
