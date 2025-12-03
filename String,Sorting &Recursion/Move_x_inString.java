public class Move_x_inString {
    public static void Move_X(int index,String str, int count, String newString){
if(index==str.length()){
for(int i=0;i<count;i++){
    newString+='x';
}
System.out.println(newString);
return;
}
        char currchar= str.charAt(index);
if(currchar=='x'){
    count++;
    Move_X(index+1,str,count,newString);
}
else{
newString+=currchar;
Move_X(index+1, str, count, newString);
}
    }

    public static void main(String[] args) {
        String str="axxbcxxd";
        int count=0;
        String newstring="";
        Move_X(0, str, count, newstring);
    }
}
