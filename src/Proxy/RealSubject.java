public class RealSubject extends Subject {
    public void request1(String name) {
        System.out.println("本人：RealSubject-r1()");
        super.name = name;
    }
    public void request2() {
        System.out.println("本人：RealSubject-r2()");
    }
    public void request3() {
        System.out.println("本人：RealSubject[" + name + "]-r3()");
    }
}

