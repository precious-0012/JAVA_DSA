package array.4;

public import java.util.*;
class swap{
    static void swapUsingAnotherVariable(int a,int b){
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
    static void swapWithoutUsingAnotherVariable(int a,int b){
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

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value of a and b");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
// 		swap.swapUsingAnotherVariable(a,b);
        swap.swapWithoutUsingAnotherVariable(a,b);
	}
} {
    
}
