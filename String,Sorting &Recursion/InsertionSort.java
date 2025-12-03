public class InsertionSort {
     public static void PrintArray(int arr[]){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
          int [] arr={12,43,40,32,16};
          for(int i=1;i<arr.length;i++){
            int current=arr[i];
int j=i-1;
while (j>=0 && current<arr[j]) {
    arr[j+1]=arr[j];
j--;
}
arr[j+1]=current;
}
PrintArray(arr);
        }
}

