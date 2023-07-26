import java.util.Arrays;

public class Main_for_task7and8 {
    public static void main(String[] args) {
        int[] valueq7 = new int[]{3, 4};
        int[] valueq8 = new int[]{3, 4};
        System.out.printf("Задание 7 %s%n", Arrays.toString(changeValue7q(valueq7)));
        System.out.printf("Задание 8 %s%n", Arrays.toString(changeValue8q(valueq8)));

    }


    private static int[] changeValue7q(int[] value) {
//        value[0] = 1;
//        value[1] = 2;
        return value = new int[]{1, 2};
    }

    private static int[] changeValue8q(int[] value) {
        value[0] = 99;
        return value;
    }

}
