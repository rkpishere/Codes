public class Occurence {
    public static int first = -1;
    public static int last = -1;
    public static void Occur(String str, int index, char element){
        if(index==str.length()){
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
            return;
        }
        char currchar=str.charAt(index);
        if(currchar==element){
            if(first==-1){
                first=index;
            
            }else{
                last=index;
            }
           
        }
        Occur(str, index+1, element);
    }
    public static void main(String[] args) {
        String str="abcaadefaah";
        char element='a';
        Occur(str, 0, element);
    }

}
