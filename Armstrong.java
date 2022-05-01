public class Armstrong {
static void armstrong(int n) {
    int rem = 0;
    int temp = n;
    while (temp != 0) {
int d=temp%10;
rem=(d*d*d)+rem;
temp=temp/10;
    }
    if (n==rem){
        System.out.println("Armstrong-->"+rem);
    }
    else {
        System.out.println("NO Armstrong-->"+rem);
    }
}
    public static void main(String[] args) {
    armstrong(151);
    }
}
