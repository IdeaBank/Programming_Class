public class Prime {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 2; i <= 100; ++i) {
            for (int j = 1; j < i; ++j) {
                if (i % j == 0 && j != 1)
                    break;
                if (i - 1 == j) {
                    System.out.println(i);
                    cnt++;
                }
            }
        }
        System.out.println("총 : " + cnt);
    }
}