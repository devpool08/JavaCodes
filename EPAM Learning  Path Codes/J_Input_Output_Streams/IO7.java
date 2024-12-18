package J_Input_Output_Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IO7 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_4");//demo_file_4 must not exist in the directory
        Path createdFilePath = Files.createFile(path);
        System.out.println("File created at path: " + createdFilePath);
        Path pathOld = Paths.get("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_2");
        Path pathNew = Paths.get("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_5");//demo_file_5 must not exist in the directory
        Path path1 = Files.copy(pathOld, pathNew);
        System.out.println("File content:\n"
                + new String(Files.readAllBytes(path1)));
    }
}
