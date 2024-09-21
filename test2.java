import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        System.out.println(reverseTheNumber(a));
        sc.close();
    }

    private static int reverseTheNumber(int num) {
        int reversed = 0;
        int original = Math.abs(num); // Work with the absolute value
        
        while (original != 0) {
            int digit = original % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Add it to the reversed number
            original /= 10; // Remove the last digit
        }

        // Restore the negative sign if the original number was negative
        return (num < 0) ? -reversed : reversed;
    }
}
