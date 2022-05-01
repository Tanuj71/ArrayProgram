public class shiftZeroes {
static void zero(int arr[],int n){
    int j=0;
    for(int i=0;i<n;i++){
        if(arr[i]!=0 && arr[j]==0) {
            int temp;
        temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        if (arr[j]!=0){
            j++;
        }

    }
}
static void print(int arr[],int n){
    for (int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}


    public static void main(String[] args) {
        int arr[]={1,5,0,8,0,100,0};
        int n=arr.length;
      //  print(arr,n);
        zero(arr,n);
        print(arr,n);
    }
}
