public class factorial {
    public static int fact(int n){
        if(n==0||n==1){

            return 1 ;
        }
        int fact_n1=fact(n-1);
        int fact_n=n*fact_n1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n=5;
        int factorial_n=fact(n);
        System.out.println(factorial_n);
    }
}
