import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int num;
      num=sc.nextInt();
      if(num%2==0){
          System.out.println("Even Numbe");
    }else{
        System.out.println("Odd Number");
    }
  }
    
}