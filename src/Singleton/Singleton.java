package Singleton;

/**
 * Created by hiroto on 2015/08/03.
 */
public class Singleton {
    static {
        instance = null;
    }
    //コンストラクタを生成させない
    private Singleton(){}
    private static Singleton instance;
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
