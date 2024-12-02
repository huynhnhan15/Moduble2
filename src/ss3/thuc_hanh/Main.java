package ss3.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // có static gọi bình thường....
        DemoMethod.showMethod2("ssss");
        DemoMethod.showMessange("");



        // cách gọi khi ko có static

        Scanner scanner = new Scanner(System.in);
        DemoMethod demoMethod = new DemoMethod();
        demoMethod.showMessange2("");

    }
}
