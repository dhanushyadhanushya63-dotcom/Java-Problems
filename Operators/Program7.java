import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cartValue=sc.nextInt();
        int premiumMember=sc.nextInt();
        if(cartValue>999 || premiumMember==1){
            System.out.println("Free shipping");
        }else{
            System.out.println("Shipping charges Applied");
        }
    }
}