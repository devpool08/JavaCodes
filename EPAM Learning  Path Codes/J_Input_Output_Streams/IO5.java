package J_Input_Output_Streams;

import java.io.*;
import java.util.regex.PatternSyntaxException;

public class IO5 {
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_1"))) {
            out.writeObject(Integer.valueOf(55));
            out.writeObject(Float.valueOf(5.5f));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        try (ObjectInputStream input = new ObjectInputStream(
                new FileInputStream("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_1"))) {
            Integer i = (Integer) input.readObject();
            System.out.println(i);
            Float f = (Float) input.readObject();
            System.out.println(f);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
