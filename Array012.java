public class Array012 {

    public static void main(String[] args) {
     int arr[]={0,1,0,2,2,0,1,};
     int b0=0, b1=1, b2=2;
     for (int i=0;i<arr.length;i++){
         if (arr[i]==0) b0++;
         else if (arr[i]==1) b1++;
         else b2++;

     }
     int k=0;
     for (int i=0;i<b0;i++) arr[k++]=0;
        for (int i=0;i<b1;i++) arr[k++]=1;
        for (int i=0;i<b2;i++) arr[k++]=2;
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
