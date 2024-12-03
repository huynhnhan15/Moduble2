package ss3.bai_tap;

public class BaiTap5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 0};
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
