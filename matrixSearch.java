import java.util.Arrays;

public class matrixSearch {
static int [] search(int[][] arr,int key){
    int r=0;
    int c=arr.length-1;
    while (r<arr.length && c>=0){
        if (arr[r][c]==key){
            return new  int[] {r,c};
        }
        if (arr[r][c]>key){
            c--;
        }
        else {
            r++;
        }
    }
    return new int[]{-1,-1};
}

    public static void main(String[] args) {
int arr[][]={
        {10,20,30},
        {35,38,42},
        {45,55,60},
};
        System.out.println(Arrays.toString(search(arr,25)));
    }
}
