package lesson20240515;
import java.lang.reflect.Field;

public class Injector {
    public static void inject(Object o) {
        Field[] declaredFields = o.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(StudentInfo.class)) {

                field.setAccessible(true);
                try {
                    field.set(o, new Student(field.getAnnotation(StudentInfo.class).name(),
                            field.getAnnotation(StudentInfo.class).surname(),
                            field.getAnnotation(StudentInfo.class).age()
                    ));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
