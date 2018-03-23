public class Human {

    public Human(String name, int age, String gender, int height, double weight, String school, String major, String birthday) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.school = school;
        this.major = major;
        this.birthday = birthday;
    }

    public void printInfo_printf() {
        System.out.printf("이름 : %s\n나이 : %d\n성별 : %s\n키 : %d\n몸무게 : %f\n학교 : %s\n전공 : %s\n생일 : %s", this.name, this.age, this.gender, this.height, this.weight, this.school, this.major, this.birthday);
    }

    public void printInfo_println() {
        System.out.printf("이름 : "+this.name+"\n나이 : "+this.age+"\n성별 : "+this.gender+"\n키 : "+this.height+"\n몸무게 : "+this.weight+"\n학교 : "+this.school+"\n전공 : "+this.major+"\n생일 : "+this.birthday);
    }

    private String name;
    private int age;
    private String gender;
    private int height;
    private double weight;
    private String school;
    private String major;
    private String birthday;
}