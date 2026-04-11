package oop_groupproject.britishcouncil;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AOOStream extends ObjectOutputStream {
    public AOOStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // This prevents writing a second header, allowing Append to work
    }
}