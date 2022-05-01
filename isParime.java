public class isParime {
static void prime(int n) {
    int flag=0;
    if (n == 0 || n == 1) {
        System.out.println("not prime");
    }else {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                System.out.println("Not prime");
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println("prime");
        }
    }
}

    public static void main(String[] args) {
        int n=10;
      prime(n);
    }
}
