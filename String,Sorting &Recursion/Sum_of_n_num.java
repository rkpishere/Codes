public class Sum_of_n_num {
    public static void printsum(int num,int i,int sum){
       if(i==num){
        sum+=i;
        System.out.println(sum);
        return ;
       }
        sum+=i;
        printsum(num,i+1,sum);
        
    
         
    }
    public static void main(String[] args) {
        printsum(10, 1, 0);
    }
}
