public class KadanneAlgo {
    static int MaxsumArray(int arr[],int n){
        int maxSum=0;
        int curSum=0;
        for(int i=0;i<n;i++){
            curSum+=arr[i];
        }
        if(curSum>0){
            maxSum=curSum;
        }
        if (curSum<0){
            curSum=0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
       int arr[]={0,-5,2,10,-8,12} ;
       int n=arr.length;
        System.out.println(MaxsumArray(arr,n));
    }
}
