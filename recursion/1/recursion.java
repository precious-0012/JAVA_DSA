public class recursion{
    static void printDecreasing(int n){ //5 4 3 2 1 where 5 is self work and nexts are recursive work
        //base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        
        //self work
        System.out.print(n+" ");
        
        //recursive work
        printDecreasing(n-1);

    }
    
    static void printIncreasing(int n){ //1 2 3 4 5 
        //base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        
        //recursive work
        printIncreasing(n-1);
        
        //self work
        System.out.print(n+" ");

    }
}
class Main
{
	public static void main(String[] args) {
		int n = 5;
		recursion.printIncreasing(n);
	}
}