import java.util.*;

public class main {
    public static void main(String[] args) {
        byte Target_Month = 0;

        Scanner scan = new Scanner(System.in);
        Target_Month = scan.nextByte();

        switch (Target_Month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31일");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30일");
                break;
            case 2:
                System.out.println("28일");
                break;
            default:
                System.out.println("잘못된 숫자입니다!");
        }
    }
}
