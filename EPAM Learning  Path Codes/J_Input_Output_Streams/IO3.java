package J_Input_Output_Streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO3 {
    public static void main(String[] args) {
        BufferedInputStream input = null;
        BufferedOutputStream output = null;

        try {
            input = new BufferedInputStream(new FileInputStream("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_1"));
            output = new BufferedOutputStream(new FileOutputStream("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_2"));
            int i;
            while ((i = input.read()) != -1) {
                output.write(i);
            }
        } catch (IOException e) {
            throw new RuntimeException("An error occurred while executing: " + e);
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
                System.out.println("write successfully");
            } catch (IOException e) {
                throw new RuntimeException("An error occurred while closing the streams: " + e);
            }
        }
    }
}
