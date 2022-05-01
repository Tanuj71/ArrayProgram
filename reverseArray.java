public class reverseArray {
/*public static void  reverse(int arr[], int start, int end){
while (start<end){
    int temp;
  temp=arr[start];
  arr[start]=arr[end];
  arr[end]=temp;
  start++;
  end--;
}
}*/
  /*  public static void oddArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
                System.out.print(" "+arr[i]);
            }
        }
    }*/
public static void printArray(int arr[]){
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        //int start=0;
        printArray(arr);
      //  int end=arr.length-1;
       // reverse(arr,start,end);
       // oddArray(arr);
       //printArray(arr);

    }
}
