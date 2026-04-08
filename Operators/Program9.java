import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int userName=sc.nextInt();
        int password=sc.nextInt();
        int accountLocked=sc.nextInt();
        if(userName==1 && password==1 && !(accountLocked==1)){
            System.out.println("Login Success");
        }else{
            System.out.println("Login Failed");
        }
    }
}