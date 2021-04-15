package org.tapusd.chapterthree.customio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseFileReader extends FilterInputStream {

    protected LowerCaseFileReader(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        final int c = super.read();
        if (c != -1) {
            return Character.toLowerCase((char) c);
        } else {
            return c;
        }
    }
}
