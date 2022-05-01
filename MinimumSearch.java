public class MinimumSearch {
static int searchmin(int arr[]){
    if(arr.length==0){
        return -1;
    }
    int ans=arr[0];
    for (int i=1;i<arr.length;i++){
        if(ans>arr[i]){
            ans=arr[i];

        }
    }
    return ans;

}
    public static void main(String[] args) {
        int arr[]={1,10,25,100,-3};
        System.out.print(searchmin(arr));
    }
}
