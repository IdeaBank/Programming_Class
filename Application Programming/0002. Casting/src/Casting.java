public class Casting {
    public static void main(String[] args) {
        double f;

        f = 5 / 4;
        System.out.println(f);      // f = 5/4 = 1

        f = (double) 5 / 4;
        System.out.println(f);      // f = 5.0/4 => 5.0/4.0 => 1.25

        f = 5 / (double) 4;
        System.out.println(f);      // f = 5/4.0 => 5.0/4.0 ==> 1.25

        f = (int) 1.3 + (int) 1.5;  // f = 1+1 => 2
        System.out.println(f);
    }
}
