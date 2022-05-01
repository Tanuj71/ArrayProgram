public class selectionSort {
static void sort(int arr[]){
    for(int i=0;i<arr.length-1;i++) {
        int smallest = i;
        for (int j = i; j < arr.length; j++) {
            if (arr[smallest] > arr[j]) {
                smallest = j;
            }
        }
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
    }
}
static void printArray(int arr[]){
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
      int arr[]={10,25,2,54,1};
       sort(arr);
       printArray(arr);
    }
}
