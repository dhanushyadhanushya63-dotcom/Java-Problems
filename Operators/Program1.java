import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int theory=sc.nextInt();
        int practical=sc.nextInt();
        double avg=(theory+practical)/2.0; 
        if(theory>=50 && practical>=50 && avg>=60){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
