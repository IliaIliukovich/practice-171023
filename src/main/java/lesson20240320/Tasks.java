package lesson20240320;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Stream;

public class Tasks {

    public static void main(String[] args) {
    // 1. Напишите программу для получения списка файлов с расширением .txt из указанной папки
        File folder = new File("D:\\Tel-Ran\\projects\\practice-171023\\resources");
        System.out.println(folder.exists());
        System.out.println(folder.isDirectory());
        File[] files = folder.listFiles();
        Stream.of(files).filter(file -> file.getName().endsWith(".txt")).forEach(System.out::println);

        FilenameFilter filenameFilter = (dir, name) -> name.endsWith(".txt");
        File[] txtFiles = folder.listFiles(filenameFilter);
        System.out.println(Arrays.toString(txtFiles));

    // 2. Напишите программу, чтобы получить размер файла в байтах, КБ, МБ
        File file = new File("./resources/out.txt");
        long length = file.length();
        System.out.println(length + " bytes");
        System.out.println((double) length / 1024 + " kb");
        System.out.println((double) length / 1024 / 1024 + " mb");

    // 3. Реализовать логирование стектрейса Exception со временем ошибки в файл errors.log

        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            File logFile = new File("./resources/errors.log");
            try (
                    FileWriter writer = new FileWriter(logFile, true);
                    PrintWriter printWriter = new PrintWriter(writer);
                    ) {
                Date date = new Date();
                printWriter.println(date);
                e.printStackTrace(printWriter);
            } catch (IOException ex) {
            }
        }


    // 4. Написать программу, которая дает пользователю арифметическую задачу со случайными числами и проверяет ответ





    }


}
