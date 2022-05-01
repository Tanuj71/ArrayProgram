public class TwoSum {
static int[] sum(int arr[] ,int target){
    int start=0;
    int end=arr.length-1;
    int result[]=new int[2];
    while (start<end){
        int sum=arr[start]+arr[end];
        if(sum==target){
            result[0]=start+1;
                    result[1]=end+1;
        }
      else   if (sum<target){
           start++;
        }
      else {
          end--;
        }
    }
    return result;
}

    public static void main(String[] args) {
    int arr[]={-3,2,3,3,6,8,15};
    int target=6;
        System.out.println(sum(arr,target));
    }

}
