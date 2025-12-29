package array;

public class reversearray {
    public static void main(String[]args){
        int []a={5,4,3,2,1};
         int b=4;
        for(int i=0;i<=b;i++){
            a[i]=a[b];
            b--;

        }
        for(int i=0;i<=a.length;i++){
        System.out.print(a[i]);}
    }
    
}
