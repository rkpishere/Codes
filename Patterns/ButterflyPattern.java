
public class ButterflyPattern {
    public static void main(String[] args) {
        /*
         * for (int i = 1; i <= 4; i++) {
         * for (int j = 1; j <= 8; j++) {
         * if (j <= i) {
         * System.out.print("*");
         * } else if (i + j > 8) {
         * System.out.print("*");
         * } else {
         * System.out.print(" ");
         * }
         * 
         * }
         * System.out.println();
         * 
         * }
         * 
         * for (int i = 4; i >= 1; i--) {
         * for (int j = 1; j <= 8; j++) {
         * if (j <= i) {
         * System.out.print("*");
         * } else if (j + i >= 9) {
         * System.out.print("*");
         * } else {
         * System.out.print(" ");
         * }
         * 
         * }
         * System.out.println();
         * 
         * }
         */
        // upper part
        for (int i = 0; i <= 4; i++) {
            // left side
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (4 - i);
            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // right side
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower part
        for (int i = 4; i >= 1; i--) {
            // left side
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (4 - i);
            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // right side
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
