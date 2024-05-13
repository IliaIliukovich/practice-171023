package lesson20240320;

import java.io.*;

public class FileExample {

    public static void main(String[] args) {
        File file = new File("./resources/out.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    //        FileWriter writer = null;
    //        BufferedWriter bufferedWriter = null;
        try (
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            ){
            bufferedWriter.write("Hello world");
            bufferedWriter.flush();
        } catch (IOException ignore) {
            // logic for exception
        }
    }

}


