import java.util.*;
public class swap{
    static void swapByAnotherVariable(int a,int b){
        System.out.println("Original value before swap");
        System.out.println("a "+a);
        System.out.println("b "+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Original value after swap");
        System.out.println("a "+a);
        System.out.println("b "+b);
    }    
    static void swapWithoutByAnotherVariable(int a,int b){
        System.out.println("Original value before swap");
        System.out.println("a "+a);
        System.out.println("b "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Original value after swap");
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}

class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value of a and b");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
// 		swap.swapByAnotherVariable(a,b);
        swap.swapWithoutByAnotherVariable(a,b);
	}
}
