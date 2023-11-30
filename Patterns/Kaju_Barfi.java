public class Kaju_Barfi {
    public static void main(String[] args) {
        int n = 21, r, c, space;
		int h=n/2;
        for (r = 1; r <= n; r++) {
            for (space = 1; space <=(n - (h + r)) || space <=(r + h - n); space++) {
                System.out.print(" ");
            }
            for (c = 1; c <= r && c <= (n - r + 1); c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//        *                r=1     c=1 
//       * *               r=2     c=2
//      * * *              r=3     c=3
//     * * * *             r=4     c=4
//    * * * * *            r=5     c=5
//     * * * *             r=6     c=4
//      * * *              r=7     c=3
//       * *               r=8     c=2
//        *                r=9     c=1
