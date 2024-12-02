package ss2.bai_tap;

public class BaiTap2 {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là:");
        int count = 0, N = 2;
        while (count < 20) {
            boolean isPrime = true;
            if (N < 2) isPrime = false;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
}
