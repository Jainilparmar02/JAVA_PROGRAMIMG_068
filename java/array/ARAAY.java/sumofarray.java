    import java.util.Scanner;
    //package array;

    public class sumofarray {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the size of array:");
            int size=sc.nextInt();
            int[] sum= new int[size];
            for(int i=0;i<=size-1;i++){
            System.out.println("enter the element of array:"+i);
            sum[i]=sc.nextInt();
            }
            int sum1=0;
            for(int i=0;i<=size-1;i++){
                sum1=sum[i]+sum1;
        }
        System.out.println("the sum of all array elemnet is:" +sum1);
    }
}