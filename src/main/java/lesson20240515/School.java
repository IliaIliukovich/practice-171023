package lesson20240515;

public class School {
    @StudentInfo(name = "Tom", surname = "Smith", age = 15)
    private Student student1;

    @StudentInfo(name = "Mary", surname = "Jennings", age = 17)
    private Student student2;

    public static void main(String[] args) {
        School school = new School();
        System.out.println("Before injection:");
        System.out.println(school.student1);
        System.out.println(school.student2);

        Injector.inject(school);
        System.out.println("After injection:");
        System.out.println(school.student1);
        System.out.println(school.student2);
    }
}
