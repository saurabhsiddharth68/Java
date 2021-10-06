import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        float a;
        System.out.println("Enter a Number=");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        float b;
        System.out.println("Enter b Number=");

        b = sc.nextFloat();

        float c = a;
        a = b;
        b = c;
        System.out.println("After Swap");
        System.out.println("Swap Number" + a);
        System.out.println("Swap Number" + b);

    }
}
