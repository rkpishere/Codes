package HashSetAndHashmap;

import java.util.HashSet;

public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        int [] num1={7,3,9};
        int [] num2={5,3,9,2,9,4};
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for (int i : num2) {
            set.add(i);
        }
        int count=0;
        for (int i : num1) {
            if(set.contains(i)){
                set2.add(i);
                count++;
            }
        }
        System.out.println("Total common element "+count);
        System.out.println(set2);
    }
}
