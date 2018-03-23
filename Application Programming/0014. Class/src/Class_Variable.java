public class Class_Variable
{
    public static void main(String[] args)
    {
        FinalAndStatic Test = new FinalAndStatic();
        FinalAndStatic Test2 = new FinalAndStatic();

        System.out.println(Test.StaticNumber);
        Test2.StaticNumber = 4;
        System.out.println(Test2.StaticNumber);

        System.out.println(System.identityHashCode(Test.StaticNumber));
        System.out.println(System.identityHashCode(Test2.StaticNumber));
        //같은 메모리주소 공유.

    }
}

class FinalAndStatic
{
    public final double PI = 3.14;
    //PI = 3.141592; ==> 불가능.
    public static int StaticNumber = 10;
}
