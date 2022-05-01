public class stringPalindrome {
public boolean palindrom(String word){
    char[] charArray=word.toCharArray();
    int start=0;
    int end=word.length()-1;
    while (start<=end){
        if (charArray[start]!=charArray[end]){
            return false;
        }
    start++;
        end--;
    }
    return true;
}

    public static void main(String[] args) {
        stringPalindrome sp=new stringPalindrome();
        if (sp.palindrom("mada")){
            System.out.println("Palindrome");
        }else {
            System.out.println("NO");
        }
    }
}
