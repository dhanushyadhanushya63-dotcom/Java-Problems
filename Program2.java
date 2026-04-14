import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int accountBalance=sc.nextInt();
       int withdrawal=sc.nextInt(); 
       int dailyLimit=sc.nextInt();
       if(withdrawal<=accountBalance && withdrawal<=accountBalance){
           System.out.println("Approved");
       }
       else{
           System.out.println("Declined");
       }
    }
}
