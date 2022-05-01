import java.util.Arrays;

public class bubbleSort {
static void sort(int arr[]){
    for (int i=0;i<arr.length-1;i++){
        for (int j=1;j<arr.length-i;j++){
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
    }
}

    public static void main(String[] args) {
        int arr[]={12,20,10,2};
      sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
