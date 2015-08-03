package Singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created by hiroto on 2015/08/03.
 */
public class Exec {
    public static void main(String args[]) {
//        Singleton s = new Singleton(); newによるインスタンスの生成ができない
        Singleton s = Singleton.getInstance();
        Singleton t = Singleton.getInstance();
        if (s == t) {
            System.out.println("等しい");
        } else {
            System.out.println("等しくない");
        }
        Singleton[] sing = new Singleton[10];
        for (int i = 0; i < 10; i++) {
            sing[i] = Singleton.getInstance();
            System.out.println(sing[i]);
        }
    }
}
