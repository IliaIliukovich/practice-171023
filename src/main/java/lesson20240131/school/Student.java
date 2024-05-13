package lesson20240131.school;

import java.util.Arrays;

public class Student {

    private String name;

    private Subject[] studiedSubjects = new Subject[Subject.values().length];

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studiedSubjects=" + Arrays.toString(studiedSubjects) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject[] getStudiedSubjects() {
        return studiedSubjects;
    }

    public void setStudiedSubjects(Subject[] studiedSubjects) {
        this.studiedSubjects = studiedSubjects;
    }
}
