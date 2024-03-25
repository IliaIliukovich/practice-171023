package lesson20240325;

import java.io.*;

public class ReadWriteBytesFromFile {

    public static void main(String[] args) {
        // 1. Записать 3 бита '101' в файл, считать их.

//        int data;
        byte data = 0b101;
        data = 5;

//        byte[] data = {1,0,1};

        File file = new File("./resources/binary");

        try (
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        ) {
            fileOutputStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
            FileInputStream fileInputStream = new FileInputStream(file);
                ) {
            int result = 0;
            while (result != -1){
                result = fileInputStream.read();
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
