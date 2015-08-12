public class Client {
    public static void main(String[] args) {
        Subject sub = new Proxy();
        sub.request1("AAA");
        sub.request2();
        sub.request3();
    }
}
