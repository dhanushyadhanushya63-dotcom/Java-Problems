import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a,b,c;
       int sum;
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       sum=a+b+c;
       System.out.println("Sum;"+sum);
    }
}