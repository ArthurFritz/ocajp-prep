package exception.leason.three;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestTryCatch {
    public static void main(String[] args) {
        String name = null;
        try {
            name.toLowerCase();
            System.out.println("next line");
        } catch (Throwable ex){//Error, Throwable, Exception, RuntimeException all location code
            System.out.println("catch exception");
        }// catch (IOException ex){ not compiled, not explicit information exception Checked
        //    System.out.println("catch exception");
        //}

        try{
            new FileInputStream("a.x");
        }catch (IOException ex){
            System.out.println("catch exception");
        }
        System.out.println("terminei");
    }
}
