import java.util.Scanner;
public class pattern8{
    public static  void main(String[]args){
        int i,j;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for (i = n; i >= 1; i--) {
        for(int sp=0;sp<=n-1;sp++){
             System.out.print(" ");}

    for (j = 1; j <=i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

       }
    }
