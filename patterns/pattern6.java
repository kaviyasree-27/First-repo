
    
import java.util.Scanner;
public class pattern6{
    public static  void main(String[]args){
        int i,j;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for (i = 1; i <= n*2-1; i++) {
        int coltime=i>n?(2*n)-i:i;

    for (j = 1; j <=coltime; j++) {
        System.out.print("*"+" ");
    }
    System.out.println();
}

    }}


