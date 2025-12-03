class String_Builder{
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.charAt(3));
sb.setCharAt(0, 'B');
        System.out.println(sb);
        sb.insert(3, 'a');
        System.out.println(sb);
        //delete a from string
        sb.delete(3, 4);
        System.out.println(sb);
        sb.delete(4, 5);
        System.out.println(sb);
sb.append("a");
sb.append("c");
sb.append("h");
sb.append("a");
sb.append("o");
System.out.println(sb);
System.out.println(sb.length());
//reverse
for(int i=0;i<sb.length()/2;i++){
    int front=i;
    int back=sb.length()-1-i;
char frontchar=sb.charAt(front);
char backchar=sb.charAt(back);
sb.setCharAt(front, backchar);
sb.setCharAt(back, frontchar);
}
System.out.println(sb);
sb.reverse();
System.out.println(sb);
    }
}