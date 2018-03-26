class Employee
{
    Employee()
    {
        this("Hong-gil Dong", "010-0000-0000", 7530);
    }

    Employee(String name)
    {
        this(name, "010-0000-0000", 7530);
    }

    Employee(String name, String phone)
    {
        this(name, phone, 7530);
    }

    Employee(String name, String phone, long salary)
    {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    void printInfo()
    {
        System.out.println("Name : " + this.name + "\n" + "Phone Number : " + this.phone + "\n" + "Salary : " + this.salary);
    }

    private String name;
    private String phone;
    private long salary;
}

public class Method
{
    public static void main(String[] args)
    {
        String my_salary = new String();
        my_salary = "1";


        Employee Woojin = new Employee("Woojin Lim", "010-83023-3090", 150000000);
        Employee Basic = new Employee();

        Woojin.printInfo();
        Basic.printInfo();
    }
}