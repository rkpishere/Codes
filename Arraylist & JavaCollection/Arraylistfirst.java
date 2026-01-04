//package Arraylist & JavaCollection;
import java.util.*;
public class Arraylistfirst {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
       // ArrayList<String> str=new ArrayList<String>();
      //add element
        arr.add(1);
        arr.add(2);
        arr.add(3); 
        arr.add(4);
        System.out.println(arr);
        
        // get element
   int ele= arr.get(2);
   System.out.println(ele); 
   // add element in between
   arr.add(0, 0);
   System.out.println(arr);
//set element
arr.set(0, 5);
System.out.println(arr);
// delete element
arr.remove(4);
System.out.println(arr);
// count size of arra
System.out.println(arr.size());
//loops
for(int i=0;i<arr.size();i++){
    System.out.println(arr.get(i));
}
//sorting
Collections.sort(arr);
System.out.println(arr);

    }
    }

