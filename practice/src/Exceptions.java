import com.sun.deploy.net.MessageHeader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions extends Base {
    /*
    1 Create a readMe.txt file on c drive
    2 Locate your file reader class
    3 finally works with try block
     */

    public static String readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("C:\\readMe.txt");
        return fileReader.toString();
    }

    public static String readTest() {
        String test = null;
        try {
            test.toString();
        } catch (Exception e) {
            System.out.println("It is a null_pointer exception");
        }
        return test.toString();
    }

    public static int sample(){
        return 0/0;
    }
}
