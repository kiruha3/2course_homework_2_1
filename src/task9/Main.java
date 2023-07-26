package task9;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lyapis", "Trubetsky");
        changePerson(person);
        System.out.println("person.toString() = " + person.toString());
        Person person1 = new Person("Lyapis", "Trubetsky");
        changePerson1(person1);
        System.out.println("person.toString() = " + person1.toString());
    }

    private static void changePerson(Person person) {
        //задание 9
        person = new Person("ilya", "Lagutenko");
    }

    private static void changePerson1(Person person1) {
        //задание 10
        person1.name = "ilya";
        person1.surname = "Lagutenko";
    }

}
