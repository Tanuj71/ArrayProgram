import java.util.Arrays;

public class kthnumber {
public static void kth(int arr[],int k) {
    Arrays.sort(arr);
    System.out.println(arr[k-1]);
}
public static void print(int arr[]){
    for (int i=0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
 int arr[]={10,5,8,2};
 kth(arr,3);
 print(arr);
    }
}
