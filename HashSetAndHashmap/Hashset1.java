package HashSetAndHashmap;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset1 {
    
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        //search
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Set does not contains 6");
        }
        //delete 
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("we deleted 1");
        }
        // size
        System.out.println("Size of set is "+set.size());
        // printing all elements of set
        System.out.println(set);

        //iterator
        Iterator<Integer> it=set.iterator();

        // hashnext() & next()
       while (it.hasNext()) {
        System.out.println(it.next());
       } 
    }
}
