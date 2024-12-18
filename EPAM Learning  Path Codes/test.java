import java.io.IOException;
import java.io.InputStream;
public class test {

         public static void main(String[] args) throws IOException {
              InputStream in = System.in;

              byte b[] = {};
              int n = in.read(b);

              System.out.println(n);

    }
}