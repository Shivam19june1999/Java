public class Pascaltri {
    public static int factorial(int n) {
        int i, f = 1;
        for (i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        int r, c, space, n = 5; // You need to initialize the value of n
        for (r = 0; r < n; r++) {
            for (space = 0; space < (n - r - 1); space++) {
                System.out.print(" ");
            }
            for (c = 0; c <= r; c++) {
                int s = factorial(r);
                int t = factorial(r-c);
                int u = factorial(c);
                System.out.print(s / (t * u) + " ");
            }
            System.out.println();
        }
    }
}
