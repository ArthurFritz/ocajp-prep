package beyond.leason.five;

public class TestPerson {
    public static void main(String[] args) {
        People people = new People("Arthur", "Fritz");
        //print full name of people
        System.out.println(people.getName() + " " + people.getLastName());

        System.out.println(people.getFullName());

        System.out.println(people);
    }
}
