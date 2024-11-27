package ss1.bai_tap.ss1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số tiền cần chuyển đổi (USD): ");
        double usd = Double.parseDouble(scanner.nextLine());
        double vn = usd * 23000;
        System.out.println("số tiền đã đổi là: " + vn + "VNĐ");

    }
}
