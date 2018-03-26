import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int coupon = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; ++i, coupon = scan.nextInt(), System.out.println("You get " + getService(coupon)));
    }

    private static String getService(int coupons) {
        if (0 <= coupons && coupons <= 3) {
            return "no service";
        } else if (4 <= coupons && coupons <= 5) {
            return "free cookie!";
        } else if (6 <= coupons) {
            return "free coffee!!";
        }
        throw new RuntimeException("You've entered wrong input value!!");
    }
}