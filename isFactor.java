public class isFactor {
static void factor(int n){
    for (int i=1;i<=n;i++){
        if (n%i==0){
            System.out.println(i+" ");
        }
    }
}

    public static void main(String[] args) {
    int n=20;
        factor(n);
    }
}
