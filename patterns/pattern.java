import java.util.Scanner;
public class pattern{
    public static  void main(String[]args){
        int i,j,val=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=0;i<n;i++){
           
            for(j=1;j<=i;j++){
                System.out.print(val +" ");
                val++;
            }
            System.out.print('\n');

        }

    }}