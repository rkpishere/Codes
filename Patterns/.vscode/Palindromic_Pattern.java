public class Palindromic_Pattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int spaces=5-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            } 
            for(int j=i;j>1;j--){
                System.out.print(j);
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
System.out.println();

        }
    }
}
