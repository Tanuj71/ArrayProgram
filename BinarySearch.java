public class BinarySearch {
static int Search(int arr[],int key){
    int start=0;
    int end=arr.length-1;
    while (start<=end){
        int mid=start+end/2;
//        if(key==arr[mid]) return arr[mid];
//        else if (key>arr[mid]){
//            start=mid+1;
//        }else {
//            end=mid-1;
//        }
        if(key<arr[mid]){
            end=mid-1;
        }
        else if(key>arr[mid]){
            start =mid-1;
        }
        else {
            return mid;
        }
    }
    return start;

}
    public static void main(String[] args) {
    int arr[]={10,15,22,25,30};
        System.out.println(Search(arr,22));
    }
}
