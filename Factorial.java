import java.util.Scanner;
public class Factorial {
    public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Type in a small number: ");
    int n = s.nextInt();
    int answer = factorial(n);
    System.out.println("Answer: "+answer);
    }
    
    public static int factorial(int n) {
        System.out.println(n);
        if (n<=1)
        return n;
        else
        return n*factorial(n-1);
    }
}
