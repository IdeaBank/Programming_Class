import java.util.ArrayList;
import java.util.Iterator;

public class Array_Declaration {
    public static void main(String[] args) {
        ArrayList<String> asdf = new ArrayList<>();
        asdf.add("asdf");
        asdf.add("hello");
        Iterator<String> it = asdf.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
