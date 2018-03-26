import java.util.*;

public class main {
    public static void main(String[] args) {
        int basic_salary = 9000;
        int total_salary = 0;
        byte working_hours;

        Scanner scan = new Scanner(System.in);
        working_hours = scan.nextByte();

        if (working_hours > 8) {
            total_salary += basic_salary * 8;
            working_hours -= 8;
            total_salary += (int) (working_hours) * (basic_salary * 1.5);
        } else {
            total_salary += basic_salary * working_hours;
        }
        System.out.println("총 아르바이트비 : " + total_salary);
    }
}