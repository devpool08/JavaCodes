package J_Input_Output_Streams;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IO8 {
    public static void main(String[] args) throws IOException {

        Path pathOld = Paths.get("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_2");
        Path pathNew = Paths.get("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_4");
        Path path = Files.copy(pathOld, pathNew,
                StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File content:\n"
                + new String(Files.readAllBytes(path)));

    }
}
