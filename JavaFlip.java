public class JavaFlip {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        int s = 0;
        System.out.println("Enter the number of time you want to filp the coin");
        
        for (int i = 0; i < n; i++) {
            double random = Math.random();
            if (random < 0.5)
                m++;

            else
                s++;

        }
        if (m > 0)

            System.out.println("Presentage of Heads");
        if (s > 0)

            System.out.println("Persentage of tails");

    }
}
