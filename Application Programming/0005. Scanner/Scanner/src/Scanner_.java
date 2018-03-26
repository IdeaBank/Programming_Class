import java.util.*;

public class Scanner_ {
    public static void main(String[] args) {
        String name;
        int age;
        int number;
        String major;

        Scanner scan = new Scanner(System.in);

        name = scan.next();
        age = scan.nextInt();
        number = scan.nextInt();
        major = scan.next();

        System.out.println(name + "\n" + age + "\n" + number + "\n" + major);

    }
}
