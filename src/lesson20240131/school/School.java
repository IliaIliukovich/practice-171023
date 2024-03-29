package lesson20240131.school;

public class School {

    // Модель школы
    //- класс Teacher
    //- класс Student
    //- класс School c методом main()
    //
    //1. Создать перечисление типа Subject с названием предметов в школе. Каждый учитель знает только один предмет.
    //2. Создать списки предметов у учеников (с изученными предметами). При инициализации - пустые.
    //3. Реализовать логику методов teach() у учителя с данными перечислениями,
    //чтобы после выполнения teach(Student student) у соответсвующих учеников добавлялась информация о пройденном предмете.
    //4. Продемонстрировать работу нового фунцкионала в классе School
    public static void main(String[] args) {
        Teacher mathTeacher = new Teacher("Mr. Thompson", Subject.MATH);
        Teacher literatureTeacher = new Teacher("Mrs. Smiths", Subject.LITERATURE);

        Student john = new Student("John");
        Student mary = new Student("Mary");

        mathTeacher.teach(john);
        mathTeacher.teach(mary);
        literatureTeacher.teach(mary);

        System.out.println(john);
        System.out.println(mary);
    }


}
