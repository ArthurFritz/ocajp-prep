package types.leason.five.method;

public class TestPeople {
    public static void  main (String args[]){
        People p = new People();
        p.setName("Arthur",29);
        String name = p.getName();
        System.out.println(name);
        System.out.println(p.getName());
    }
}
