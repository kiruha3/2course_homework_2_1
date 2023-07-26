package task9;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lyapis", "Trubetsky");
        changePerson(person);
        Person person1 = new Person("Lyapis", "Trubetsky");
        changePerson1(person1);
    }

    private static void changePerson(Person person) {
        //задание 9
        Person personNew = new Person("ilya", "Lagutenko");
        person = personNew;
        System.out.println("person.toString() = " + person.toString());
    }

    private static void changePerson1(Person person1) {
        //задание 10
        person1.name = "ilya";
        person1.surname = "Lagutenko";
        System.out.println("person.toString() = " + person1.toString());
    }

}
