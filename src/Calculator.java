import java.util.Scanner;

public class Calculator {
    static int x, y;
    static int total = 0;

    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter first number: ");
        x = scanner.nextInt();
        System.out.print("Enter second number: ");
        y = scanner.nextInt();

        total = add(x,y);
        System.out.println("Total: " + total);

    }

    public static int add(int x, int y){
        return x + y;
    }
}
