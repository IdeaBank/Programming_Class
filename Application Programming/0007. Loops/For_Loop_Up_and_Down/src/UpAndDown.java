import java.util.*;

public class UpAndDown
{
    public static void main(String[] args)
    {
        for (int randomNumber = new Random().nextInt(100) + 1, input = -10, cnt = 1; input != randomNumber; input = new Scanner(System.in).nextInt(), System.out.println("Current Count : " + cnt++ + "\t" + ((randomNumber == input) ? "Correct!" : randomNumber > input ? "Up" : "Down")));
    }
}