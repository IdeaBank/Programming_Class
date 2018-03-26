import java.util.*;

public class While_Loop {
    public static void main(String[] args) {
        int where = new Scanner(System.in).nextInt() , i = 1;
        while (i < 10) {
            System.out.println(where + " * " + i + " = " + where * i);
            i++;
        }
    }
}
