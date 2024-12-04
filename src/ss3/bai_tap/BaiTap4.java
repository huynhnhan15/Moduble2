package ss3.bai_tap;

public class BaiTap4 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 10, 6},
                {7, 8, 9}
        };
        int max = SoLonNhat(array);
        System.out.println("phần tử lớn nhất là: " + max);
    }
    public static int SoLonNhat(int[][] array) {
        int max = array[0][0];
        for(int [] row : array){
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }

        }
        return max;
    }
}
