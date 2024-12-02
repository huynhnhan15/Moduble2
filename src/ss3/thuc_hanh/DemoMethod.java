package ss3.thuc_hanh;

public class DemoMethod {
    // method main là một method đặc biệt để bắt đầu chương trình

    private static void showMethod (String mess ) {
        System.out.println(mess);
    }
    // cho phép gọi ngoài class ( còn lại k)
    public static void showMethod2(String mess) {
        System.out.println(mess);
    }
    void sum(int a, int b ) {
        System.out.println(a + b);
    }
    int sum2(int a, int b ) {
        return a + b;
    }
    public static void showMessange(String name ) {
        System.out.println("heeee");
    }public  void showMessange2(String name ) {
        System.out.println("heeee2");
    }

}
