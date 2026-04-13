import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n,num,sum=0;
       n=sc.nextInt();
       for(int i=1;i<=n;i++){
           System.out.println("Enter number:");
           num=sc.nextInt();
           sum=sum+num;
       }
       System.out.println("Sum: "+sum);
    }
}