import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Power of 2^" + num + " is: " + (Math.pow(2, num)));
        System.out.println();
        System.out.println("Printing all till Power Value " + num);

        for (int i = 1; i <= 1; i++) {
            System.out.println("Power of 2^" + i + " is: " + (Math.pow(2, i)));
        }
    }
}
