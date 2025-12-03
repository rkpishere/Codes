public class DiamondPattern {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            int spaces=4-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            } 
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
    }
     for(int i=4;i>=1;i--){
            int spaces=4-i ;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            } 
             for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            
            }
            System.out.println();
    }
}
}