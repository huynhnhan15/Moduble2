package ss3.bai_tap;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4};

        System.out.print("Mảng ban đầu là: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Nhập số cần thêm vào mảng: ");
        int x = Integer.parseInt(scanner.nextLine());

        int[] newArray = new int[array.length + 1];

        // Sao chép các phần tử từ mảng cũ
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[newArray.length - 1] = x;

        System.out.println("Mảng sau khi được thêm là: ");
        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }
}
