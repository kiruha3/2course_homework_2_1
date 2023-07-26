//Напишите метод, который изменяет значение переменной типа int.
//        Объявите метод changeValue, который принимает параметр типа int
//        под названием value. Внутри метода с помощью оператора присваивания
//        запишите в параметр значение 22.
//        В методе main объявите переменную типа int под названием value
//        и запишите туда значение 33. В следующей строке вызовите метод
//        changeValue и передайте в него эту переменную.

public class Main {
    public static void main(String[] args) {
        int value = 33;
        System.out.println("Задание 5 и 6 идентичны " + changeValue(value));
    }
    private static int changeValue(int value) {
        return value = 33;//задание 5\6
    }

}