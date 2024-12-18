package J_Input_Output_Streams;

import java.io.*;
import java.nio.Buffer;

public class IO2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
       FileOutputStream fw = new FileOutputStream("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_1");
        String str;
        System.out.println("Enter of string.");
        System.out.println("Enter 'stop' for exit.");
        do {
            str = br.readLine();
            fw.write(str.getBytes());
            System.out.println(str);
        } while (!str.toLowerCase().equals("stop"));
        fw.close();
        br.close();
    }
}
