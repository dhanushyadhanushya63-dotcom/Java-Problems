import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int num,sum=0;
       int remainder;
       num=sc.nextInt();
       while(num!=0){
           remainder=num%10;
           sum=sum+remainder;
           num=num/10;
       }
       System.out.println("Sum of digits:"+sum);
    }
}