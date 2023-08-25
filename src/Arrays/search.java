import java.util.*;

class search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter The Elements");
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter The Element To Be Searched");
        int x=sc.nextInt();

        int c=0;

        boolean flag=false;

        for (int i=0;i<n;i++) {
            if (a[i]==x) {
                c=i;
                flag=true;
            }
        }
        if (flag) {
            System.out.println("Element Found At Index - "+(c+1));
        } else {
            System.out.println("Element Not Found");
        }
    }
}