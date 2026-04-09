import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       int baseboxes=sc.nextInt();
       int levels=sc.nextInt();
       int capacity=baseboxes<<levels;
       System.out.println("Total Capacity="+capacity);
    }
}