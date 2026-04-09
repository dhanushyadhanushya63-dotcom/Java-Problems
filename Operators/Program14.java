import java.util.Scanner;
class Main{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int permissionA=sc.nextInt();
       int permissionB=sc.nextInt();
       int result=permissionA | permissionB;
       System.out.println("Marged permission code="+result);
    }
}