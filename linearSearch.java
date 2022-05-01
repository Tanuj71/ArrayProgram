public class linearSearch {
static int search(int[] arr,int key){
    if(arr.length==0){
        return -1;
    }
    for (int index=0;index<arr.length;index++) {
        int element = arr[index];
if(element==key) {
    return index;
}
    }
    return -1;
}

    public static void main(String[] args) {
        int arr[]={1,-5,10,50,-20};
        System.out.println(search(arr,50));
    }
}
