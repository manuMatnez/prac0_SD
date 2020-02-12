package utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ComUtilsService {
    private ComUtils comUtils;

    public ComUtilsService(InputStream inputStream, OutputStream outputStream) throws IOException {
        comUtils = new ComUtils(inputStream, outputStream);
    }

    public void writeTest() {
        //TODO: put your code here
        try {
            //comUtils.write_string_variable(2,"Hola!");
            comUtils.writeChar('b');
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }

    public String readTest() {
        String result = "";
        //TODO: put your code here
        try {
            //result = comUtils.read_string_variable(2);
            result = String.valueOf(comUtils.readChar());
        } catch (IOException e) {
            System.out.println("Exception");
        }
        return result;
    }



}
