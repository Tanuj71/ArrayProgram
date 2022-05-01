public class Match {
static void StringMatch( String str) {
    char[] charArray = str.toCharArray();
    int start = 0;
    int end = str.length() - 1;
    while (start <= end) {
        int c=0;
        if (charArray[start] == charArray[end]) {
            c++;

        }
        start++;
        end--;
    }

}
    public static void main(String[] args) {
        String str="Tanuja";
        StringMatch(str);
    }
}
