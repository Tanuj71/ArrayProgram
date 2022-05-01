public class minArray {
public static void min(int arr[]){
    int min=arr[0];
    for (int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
           // System.out.println(min);
        }
    }
    System.out.println("minimum-->"+min);
}
    public static void max(int arr[]){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            max=arr[i]>max?arr[i]:max;
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
int arr[]={5,4,1,10};

min(arr);
max(arr);
    }
}
