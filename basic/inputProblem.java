import java.util.Scanner;
public class inputProblem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //When we take input of any number so it also give newline and if after that we use nextLine() so it reads whole line and return space as output.
		sc.nextLine();  //It eats that newline
		String s = sc.nextLine();
		System.out.print(s);

        //In case if next(), It work properly bcz When it see the space it will skip that until it find non-space after finding non-space when it get any space then it return its value.
    }
}