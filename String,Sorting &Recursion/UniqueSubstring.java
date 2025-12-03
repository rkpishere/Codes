import java.util.HashSet;

public class UniqueSubstring {
public static void UniqueSubsequence(String str, int index, String newString,HashSet<String>set){
if(index==str.length()){
    if(set.contains(newString)){
        return;
    }
    else{
    System.out.println(newString);
    set.add(newString);
    return;
    }
}
        char currchar=str.charAt(index);
      //  if char add
        UniqueSubsequence(str, index+1, newString+currchar,set);
        // if char not add
        UniqueSubsequence(str, index+1, newString,set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set= new HashSet<>();
        UniqueSubsequence(str, 0, "",set);
    }
}