public class main {
    public static void main(String[] args) {
        //String target = "Here is Korea Digital Media High School";

        //System.out.println(target.concat("and Here is Ansan"));
        //System.out.println(target.substring(11));
        //System.out.println(target.substring(11, 16));
        //System.out.println(target.replace('o', '0'));
        //System.out.println(target.replace("Here", "My Name"));
        //System.out.println(target.toLowerCase());
        //System.out.println(target.toUpperCase());

        String a = "asdf";


        String c = new String("asdf");

        System.out.println("a : " + System.identityHashCode(a));
        System.out.println("c : " + System.identityHashCode(c));

        c = "asdf";

        System.out.println("a : " + System.identityHashCode(a));
        System.out.println("c : " + System.identityHashCode(c));    //Hashcode까지 override 됨.
    }
}
