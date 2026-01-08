package HashSetAndHashmap;

import java.util.HashSet;

public class UnionOf2Arrays {
    public static void main(String[] args) {
        int []num1={1,2,3,4};
        int []num2={1,5,3,6,7};
        HashSet<Integer>set=new HashSet<>();
        int n1=num1.length;
        int n2=num2.length;
        int i=0;
        while(i<n1||i<n2){
            if(i<n1){
                set.add(num1[i]);
            }
            if(i<n2){
                set.add(num2[i]);
            }
            i++;
        }
        System.out.println(set);
    }
}
