package org.tapusd.chapterthree.customio;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public InputStream getStream(String fileName) {
        return this.getClass().getClassLoader().getResourceAsStream(fileName);
    }

    public static void main(String[] args) {
       Main main = new Main();
        final InputStream stream = main.getStream("test.txt");
        LowerCaseFileReader reader = new LowerCaseFileReader(stream);

        try {
            String s = "";
            while (reader.available() > 0) {
               s += (char) reader.read();
            }

            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
