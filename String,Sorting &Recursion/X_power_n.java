public class X_power_n {
    public static int power(int x,int n){
if(x==0){
    return 0;
}
if(n==0){
    return 1;
    }
    int x_power_n1=power(x,n-1);
    return x*x_power_n1;
}
    public static void main(String[] args) {
        int x=4;
        int n=5;
        int x_power_n=power(x,n);
        System.out.println(x_power_n);
    }
}
