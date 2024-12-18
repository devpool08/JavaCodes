package J_Input_Output_Streams;

import java.io.*;

public class IO4 {
    public static void main(String[] args) throws IOException {
        // Correct the outer try-with-resources block for DataOutputStream
        try (DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_1")))) {

            out.writeShort(1200);
            out.writeInt(50000);
            out.writeLong(12345678L);
            out.writeDouble(55.66);
            out.writeBoolean(true);
            out.writeUTF("Hello!!!");
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException("An error occurred while writing: " + e);
        }

        // Correct the outer try-with-resources block for DataInputStream
        try (DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("F:\\mycodes\\EPAM Learning  Path Codes\\demo_file_1")))) {

            System.out.println("short:      " + in.readShort());
            System.out.println("int:        " + in.readInt());
            System.out.println("long:       " + in.readLong());
            System.out.println("double:     " + in.readDouble());
            System.out.println("boolean:    " + in.readBoolean());
            System.out.println("String UTF: " + in.readUTF());
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException("An error occurred while reading: " + e);
        }
    }
}
