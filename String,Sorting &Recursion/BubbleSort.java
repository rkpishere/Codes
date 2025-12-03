
public class BubbleSort {
    public static void PrintArray(int arr[]){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int [] arr={12,43,40,32,16};
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter element");
//         for(int i=0;i<arr.length;i++){
// arr[i]=sc.nextInt();
//         }
//Bubble Sort
int temp=0;
for(int i=0;i<arr.length-1;i++){
    for(int j=0;j<arr.length-1-i;j++){
    if(arr[j]>arr[j+1]){
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
}
}
PrintArray(arr);

    }
}
