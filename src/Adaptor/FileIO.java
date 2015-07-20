package Adaptor;

import java.io.IOException;

/**
 * Created by hiroto on 2015/07/20.
 */
public interface FileIO {
    public abstract void readFromFile(String fileName) throws IOException;
    public abstract void writeToFile(String fileName) throws IOException;
    public abstract void setPropertySet(String key, String value);
}