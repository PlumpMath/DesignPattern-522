public class Proxy extends Subject {
    RealSubject realSubject;
    public void request1(String name) {
        System.out.println("代理：Proxy-r1()");
        super.name = name;
    }
    public void request2() {
        if (realSubject == null) {
            System.out.println("代理：Proxy-r2()");
        } else {
            realSubject.request2();
        }
    }
    public void request3() {
        System.out.println("代理：Proxy-r3()");
        if (realSubject == null) {
            realSubject = new RealSubject();
            realSubject.request1(name);
        }
        realSubject.request3();
    }
}
