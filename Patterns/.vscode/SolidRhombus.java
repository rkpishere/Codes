public class SolidRhombus {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int spaces = 5 - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
