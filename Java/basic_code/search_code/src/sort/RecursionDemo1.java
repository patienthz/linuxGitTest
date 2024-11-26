package sort;

public class RecursionDemo1 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println(getSum(number));
    }

    public static int getSum(int number) {
        if (number == 1) {
            return 1;
        } else {
            return getSum(number - 1) + number;
        }
    }
}
