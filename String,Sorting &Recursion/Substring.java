public class Substring {
    public static void Subsequences(String str, int index, String newString){
if(index==str.length()){
    System.out.println(newString);
    return;
}
        char currchar=str.charAt(index);
      //  if char add
        Subsequences(str, index+1, newString+currchar);
        // if char not add
        Subsequences(str, index+1, newString);
    }
    public static void main(String[] args) {
        String str="abc";
        Subsequences(str, 0, "");
    }
}
