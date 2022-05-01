public class findsecondChar {

static int search(char arr[],char key){
    int  start=0;
    int end=arr.length-1;
    while (start<=end){
        int mid=start+(end-start)/2;
        if(key<arr[mid]){
            end=mid-1;
        }
        start=mid+1;
    }
    return arr[start];
 }
    public static void main(String[] args) {
        char arr[]={'a','c','f','i'};
        char key='c';
        System.out.println(search(arr,key));
    }

}
