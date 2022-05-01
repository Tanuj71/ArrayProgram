public class numberPalindrome {
static void isPalindrome(int n){
    int temp=n;
    int rem=0;
    int flag=0;
    while (temp!=0){
        int digits=temp%10;
        rem=rem*10+digits;
        temp=temp/10;
    }
    if (n==rem){
        System.out.println("palindrome");
    }else {
        System.out.println("No");
    }
}

    public static void main(String[] args) {
       // isPalindrome(121);
        isPalindrome(123);
    }
}
