import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int credit=sc.nextInt();
        int purchaseAmount=sc.nextInt();
        int cardBlocked=sc.nextInt();
        if(purchaseAmount<=credit && cardBlocked==0){
            System.out.println("Approved");
        }else{
            System.out.println("Declined");
        }
    }
}