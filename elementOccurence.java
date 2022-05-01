public class elementOccurence {
static void occurance(int arr[],int key){
    for (int i=0;i<arr.length;i++){
        if(arr[i]==key){
            System.out.print(i);
           // System.out.println(arr[i]);
        }
    }
}

    public static void main(String[] args) {
        int arr[]={1,50,2,1,55,12,1};
        int key=1;
        occurance(arr,key);
    }
}
