import java.util.Arrays;

public class Main_for_task7and8 {
    public static void main(String[] args) {
        int[] valueq7 = new int[]{3, 4};
        int[] valueq8 = new int[]{3, 4};
        changeValue7q(valueq7);
        System.out.printf("Задание 7 %s%n", Arrays.toString(valueq7));
        changeValue8q(valueq8);
        System.out.printf("Задание 8 %s%n", Arrays.toString(valueq8));

    }


    private static void changeValue7q(int[] valueq7) {
        valueq7 = new int[]{1, 2};
    }

    private static void changeValue8q(int[] valueq8) {
        valueq8[0] = 99;
    }

}
