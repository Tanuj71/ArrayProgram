public class oneSidenegative {
static void rearrange(int arr[], int n){
    int temp,j=0;
    for(int i=0;i<n;i++){
        if(arr[i]<0){
           if (i!=j){
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
           j++;
        }
    }
}
static void printArray(int arr[]){
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        int arr[]={10,-1,-5,-8,2,100};
        int n=arr.length;
       // printArray(arr);
        rearrange(arr,n);
        printArray(arr);
    }
}
