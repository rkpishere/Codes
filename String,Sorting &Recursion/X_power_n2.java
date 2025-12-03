public class X_power_n2 {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            int half_power=power(x,n/2);
            return half_power*half_power;
        }else{
            int half_power=power(x,(n)/2);
            return x*half_power*half_power;
        }
    }
    public static void main(String[] args) {
        int x=4;
        int n=5;        
        int x_power_n=power(x,n);
        System.out.println(x_power_n);
    }
}
