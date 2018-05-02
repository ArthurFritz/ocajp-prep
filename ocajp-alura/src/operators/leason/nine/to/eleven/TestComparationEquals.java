package operators.leason.nine.to.eleven;

class Client{
    String name;

    public Client(String name){
        this.name = name;
    }

    public boolean equals(Object obj) {
        Client outro  = (Client) obj;
        return this.name.equals(outro.name);
    }
}

public class TestComparationEquals {
    public static void main(String[] args) {
        Client c1 = new Client("Arthur");
        Client c2 = new Client("Stephanie");

        Client c3 = new Client("Stephanie");

        System.out.println(c1 == c2);//false
        System.out.println(c1 == c1);//true
        System.out.println(c2 == c3);//false

        System.out.println(c1.equals(c2));//false
        System.out.println(c1.equals(c1));//true
        System.out.println(c2.equals(c3));//true
        System.out.println(c2.equals((Object)c3));//true

    }
}
