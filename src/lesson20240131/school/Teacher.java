package lesson20240131.school;

public class Teacher {

    private String name;

    private Subject subject;

    public Teacher(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void teach(Student student) {
        System.out.println("Teacher " + name + " teaches " + student.getName() + " " + subject);
        student.getStudiedSubjects()[subject.ordinal()] = subject;
    }

}
