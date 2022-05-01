public class sets {
static void union(int a[], int b[], int n,int m){
    int i=0,j=0;
    while (i<n && i<m){
        if(a[i]<b[j]){
            System.out.print(a[i++]+" ");
        }
        else if (a[i]>b[j]){
            System.out.print(b[j++]+" ");
        }
        else {
            System.out.print(b[j++]+" ");
            i++;
        }
    }
    while (i<m) System.out.print(a[i++]+" ");
    while (j<n) System.out.print(b[j++]+" ");
}

    public static void main(String[] args) {
        int a[]={1,3,6,8,10};
        int b[]={2,4,5,7,8};
        int n=a.length;
        int m=b.length;
        union(a,b,n,m);
    }
}
