import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int fileSize=sc.nextInt();
        int compressionCycle=sc.nextInt();
        int size=fileSize>>compressionCycle;
        System.out.println("Compressed Size="+size);
    }
}