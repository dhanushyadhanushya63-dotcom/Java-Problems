import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, originalNum, remainder, result = 0, n = 0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        originalNum = num;
        while (originalNum != 0) {
            originalNum /= 10;
            n++;
        }
        originalNum = num;
        while (originalNum != 0) {
            remainder = originalNum % 10;
            int power = 1;
            for (int i = 1; i <= n; i++) {
                power = power * remainder;
            }
            result += power;
            originalNum /= 10;
        }
        if (result == num) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}