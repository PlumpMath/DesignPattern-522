package Adaptor;

import java.io.IOException;

/**
 * Adaptorパターン
 * 参考:http://qiita.com/jonichonpa/items/b7b68dca41ed5eac8bbb
 */

/**
 * Created by hiroto on 2015/07/20.
 */
public class Exec {
    public static void main(String args[]) {
        FileIO fileio = new FileProperty();
        try {
            fileio.readFromFile("input.txt");
            fileio.setPropertySet("test", "1000");
            fileio.setPropertySet("test2", "aiueo");
            fileio.setPropertySet("test3", "???");
            fileio.writeToFile("output.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }
    }
}