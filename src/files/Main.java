package files;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("plik.txt");
        if(!file.exists()) {
            file.createNewFile();
        }
    }
}