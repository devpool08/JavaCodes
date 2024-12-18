package J_Input_Output_Streams;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IO6 {
    public static void main(String[] args) throws IOException {

        Path testFilePath = Paths.get("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_2");
        System.out.println("Printing file information: ");
        System.out.println("  file name: " + testFilePath.getFileName());//file name: demo_file_2
        System.out.println("  element name: " + testFilePath.getName(1));//  element name: EPAM Learning  Path Codes
        System.out.println("  root of the path: " + testFilePath.getRoot());//  root of the path: F:\
        System.out.println("  parent of the target: " + testFilePath.getParent());//  parent of the target: F:\mycodes\EPAM Learning  Path Codes
        System.out.println("Printing elements of the path: ");
        for (Path element : testFilePath) {
            System.out.println("  path element: " + element);
        }/*
        Printing elements of the path:
  path element: mycodes
  path element: EPAM Learning  Path Codes
  path element: demo_file_2
        */
        System.out.println("absolute path "+testFilePath.toAbsolutePath());//absolute path F:\mycodes\EPAM Learning  Path Codes\demo_file_2
        System.out.println("Its normalized path is: " + testFilePath.normalize());//Its normalized path is: F:\mycodes\EPAM Learning  Path Codes\demo_file_2
        System.out.println("Its real path is: " + testFilePath.toRealPath());//Its real path is: F:\mycodes\EPAM Learning  Path Codes\demo_file_2


    }
}
