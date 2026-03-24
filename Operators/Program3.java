import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int workingHours=sc.nextInt();
        int attendance=sc.nextInt();
       if(workingHours>40 && attendance>90){
           System.out.println("Eligible");
       }else{
           System.out.println("Not Eligible");
       }
    }
}