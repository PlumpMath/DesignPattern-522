package Adaptor;

/**
 * Created by hiroto on 2015/07/20.
 */
import java.io.*;
import java.util.Properties;

public class FileProperty extends Properties implements FileIO {
    @Override
    public void readFromFile(String fileName) throws IOException {
        load(new FileInputStream(fileName));
    }

    @Override
    public void setPropertySet(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        store(new FileOutputStream(fileName), "Output all property");
    }
}