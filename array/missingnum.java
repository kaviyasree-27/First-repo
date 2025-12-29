package array;

public class missingnum {
    public static void main(String[]args){
        int []a={1,2,3,4,6};
        for(int i=0;i<a.length;i++){
            if(a[i+1]!=a[i]+1){
                System.out.print(a[i]+1);
                break;
            }
        }
    }
    
}
