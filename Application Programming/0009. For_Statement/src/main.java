import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int result = 1, input = new Scanner(System.in).nextInt();
        for (byte it = 1; it <= input; result *= it++) ;
        System.out.println(result);
    }
}