import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int unitConsumed=sc.nextInt();
        int voltageFluctuation=sc.nextInt();
        if(unitConsumed>500 || voltageFluctuation==1){
            System.out.println("Alert Triggered");
        }else{
            System.out.println("Normal Usage");
        }
    }
}