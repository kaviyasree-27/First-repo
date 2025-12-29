
    
import java.util.Scanner;
public class pattern7{
    public static  void main(String[]args){
        int i,j;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for (i = 1; i <= n; i++) {
        for(int sp=1;sp<=n-i;sp++){
             System.out.print(" ");}

    for (j = 1; j <=i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

       }
    }
