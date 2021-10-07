import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int A, B, C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entar A Number");
        A = sc.nextInt();
        System.out.println("Enter B Number");
        B = sc.nextInt();
        System.out.println("Enter C Number");
        C = sc.nextInt();
        if (A >= B && A >= C)
            System.out.println("A is the largest Number");
        else if (B >= A && B >= C)
            System.out.println("B is the largest Number");
        else
            System.out.println("C is the largest number");
    }
}
