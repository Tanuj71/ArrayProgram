public class EvenDigits {
static   int findnumber(int nums[]){
    int count=0;
    for (int num:nums){
        if(even(num)){
            count++;
        }
    }
    return count;
}
static boolean even(int num){
    int numdigits=digit(num);
    return numdigits%2==0;
}
static int digit(int num){
    if(num<0){
        return -1;
    }
    if(num==0){
        return 1;
    }
    int count=0;
    while (num>0){
        count++;
        num=num/10;
    }
    return count;
}

    public static void main(String[] args) {
        int num[]={12,345,1425,0,55};
        int c=0;
        System.out.println(findnumber(num));

        }
    }

