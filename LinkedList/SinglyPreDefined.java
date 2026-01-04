package LinkedList;
import java.util.*;
public class SinglyPreDefined {
    
public static void main(String[] args) {
    
    LinkedList<String> list=new LinkedList<>();
    list.addFirst("is");
    list.addFirst("5");
    list.addLast("a");
    list.addLast("number");
    list.add(3,"natural");
    System.out.println(list);
    System.out.println(list.size());
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+"->");
    }
    list.removeFirst();
    list.removeLast();
    System.out.println(list);

    

}
}
