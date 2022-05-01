public class missingNumber {
static int missing(int arr[],int n){
    int sum;
    sum=n*(n+1)/2;
    for (int num:arr){
        sum=sum-num;
    }
    return sum;
}
    public static void main(String[] args) {
int arr[]={1,5,2,3,7,4};
int n=arr.length+1;
        System.out.println(missing(arr,n));
    }
}
