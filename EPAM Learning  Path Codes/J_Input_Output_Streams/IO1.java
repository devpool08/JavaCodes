package J_Input_Output_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO1 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_2");
            fileOutputStream = new FileOutputStream("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_1");
            int content;
            while ((content = fileInputStream.read()) != -1) {
                fileOutputStream.write(content);
            }
        } catch (IOException e) {
            throw new RuntimeException("Some error occurred while executing: " + e);
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                System.out.println("File copied successfully!");

            } catch (IOException e) {
                throw new RuntimeException("Some error occurred while closing the streams: " + e);
            }
        }
    }
}
