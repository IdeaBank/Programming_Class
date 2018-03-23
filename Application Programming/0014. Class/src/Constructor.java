public class Constructor
{
    public static void main(String[] args)
    {
        Student Kim = new Student("Kim Hyunwoo");
    }
}
class Student
{
    Student(String name)
    {
        this.name = name;
    }
    private String name;
}