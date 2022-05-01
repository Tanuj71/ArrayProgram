public class mergesortedArray {
static int[] merge(int arr1[],int arr2[],int n,int m){
    int[] result=new int[n+m];
    int i=0,j=0,k=0;

    while (i<n && j<m){
        if (arr1[i]<arr2[j]){
            result[k]=arr1[i];
            i++;
        }else {
            result[k]=arr2[j];
            j++;
        }
        k++;
    }
    while (i<n){
        result[k]=arr1[i];
        i++;
        k++;
    }
    while (j<m){
        result[k]=arr2[j];
        j++;
        k++;
    }
  return   result;
}
public void print(int arr[]){
    for (int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
}

    public static void main(String[] args) {
        int arr1[]={1,4,8,10};
        int arr2[]={2,7,9,11};
        int n=arr1.length;
        int m=arr2.length;
      //  merge(arr1,arr2,n,m);
        mergesortedArray mg=new mergesortedArray();
        mg.print(arr1);
        mg.print(arr2);
        int[] result=merge(arr1,arr2,n,m);
        mg.print(result);
    }
}
