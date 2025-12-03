public class RemoveDuplicates {
    public static boolean[] map=new boolean[26];
    public static void Remove_Duplicates(String str,int index, String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(index);
        if(map[currchar-'a']){
            //duplicate
            Remove_Duplicates(str, index+1, newString);

    }
    else{
        newString+=currchar;
        map[currchar-'a']=true;
        Remove_Duplicates(str, index+1, newString);

    }}
        public static void main(String[] args) {
        String str="abbbccccdaaaa";
        Remove_Duplicates(str, 0, "");
    }
}
