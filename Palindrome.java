public class Palindrome {
static void isPalindrome(int n){
    int temp=n;
    int rev=0;
    while (temp!=0){
        int d=temp%10;
        rev=(rev*10)+d;
        temp=temp/10;
    }
    if (n==rev){
        System.out.println("Palindrome-->"+rev);
    }else {
        System.out.println("Not Palindrome-->"+rev);
    }
}

    public static void main(String[] args) {
        int n=12321;
        isPalindrome(n);
    }
}
