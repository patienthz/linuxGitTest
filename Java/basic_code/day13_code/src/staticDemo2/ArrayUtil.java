package staticDemo2;

public class ArrayUtil {

    //私有化构造方法
    //目的，不让外界创造他的对象
    private ArrayUtil() {

    }

    //pritArr方法为静态的,用于返回整数数组的内容
    public static String printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1) {
                sb.append(arr[i]).append("]");
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }

    public static double getAeverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }

}
