public class Selectionsort {
    public static void PrintArray(int arr[]){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int [] arr={12,43,40,32,16};
        for(int i=0;i<arr.length-1;i++){
            int min=i;
for(int j=i+1;j<arr.length;j++){
    if(arr[min]>arr[j]){
        min=j;
        
    }
    int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
}

        }
        PrintArray(arr);
    }
}
