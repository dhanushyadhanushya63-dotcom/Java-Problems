import java.util.Scanner;
class Main{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int signalValue=sc.nextInt();
       int toggleMask=sc.nextInt();
       int result=signalValue^toggleMask;
       System.out.println("Toggle Signal="+result);
    }
}