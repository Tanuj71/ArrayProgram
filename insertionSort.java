import java.util.Arrays;

public class insertionSort {
static void sort(int arr[]){
    for (int i=0;i<arr.length;i++){ //time complexity n^2
        int current=arr[i];
        int j=i-1;
       while (j>=0 && current<arr[j]){
           arr[j+1]=arr[j];
           j--;
       }
       arr[j+1]=current;
    }
}

    public static void main(String[] args) {
    int arr[]={10,5,25,1,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
