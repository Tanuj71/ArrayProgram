public class maxWeakthperson {

    public static void main(String[] args) {
        int arr[][]={{1,2,3}, {1,5,2}};

        System.out.println(max(arr));
    }
static int max(int[][] account){
        int  ans=Integer.MAX_VALUE;
        for (int per=0;per<account.length;per++){
            int sum=0;
            for (int acc=0;acc<account[per].length;acc++){
sum=sum+account[per][acc];
            }
            if (ans<sum){
                ans=sum;
            }
        }
        return ans;

    }
}
