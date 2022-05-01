public class FindUnique {
    static void find(int arr[]) {
//        int unique = 0;
//        for (int n : arr) {
//            unique ^= n;
//        }
//        return unique;

        for (int i=0;i<arr.length;i++){
            int c=0;
            for (int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    //System.out.println(arr[i]);
                    c++;
                }
            }
            if (c==1){
                System.out.println(arr[i]+" ");
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 1, 5, 6, 7, 7, 2};
  find(arr);
    }
}