public class reverseNum {
static void reverse(int n){
    int rem=0;
    while (n!=0){
        int d=n%10;
        rem=rem*10+d;
        n=n/10;
    }
    System.out.println("Reverse Number-->"+rem);
}
    public static void main(String[] args) {
        reverse(1234);
    }
}
