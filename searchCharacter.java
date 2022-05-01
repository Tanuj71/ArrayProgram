public class searchCharacter {
static boolean Charsearch(String a,char b){
    if(a.length()==0){
        return false;
    }
    for (int i=0;i<a.length();i++){

        if (b==a.charAt(i)){
            return true;
        }
    }
    return false;
}

    public static void main(String[] args) {
        String a="Tanuj";
        char b='u';
        System.out.println(Charsearch(a,b));
    }
}
