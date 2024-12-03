package ss3.bai_tap;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] mangA = {1, 2, 3};
        int[] mangB = {4, 5, 6};

        System.out.println("mangA: ");
        for (int i : mangA) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("mangB: ");
        for (int i : mangB) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] mangC = new int[mangA.length + mangB.length];
        int index = 0;
        for (int i : mangA) {
            mangC[index++] = i;
        }
        for (int i : mangB) {
            mangC[index++] = i;
        }

        System.out.println("Mảng sau khi gọp: ");
        for (int i : mangC) {
            System.out.print(i + " ");
        }
    }
}
