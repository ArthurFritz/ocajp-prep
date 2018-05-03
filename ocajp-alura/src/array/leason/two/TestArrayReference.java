package array.leason.two;

class Client {
    String name;
}

class EspecialClient extends Client {

}

public class TestArrayReference {
    public static void main(String args[]){
        Client[] clients = new Client[10];

        for (int i = 0; i < clients.length ; i ++){
            clients[i] = new Client();
            clients[i].name = "Arthur " + i;
        }

        for (Client c: clients) {
            System.out.println(c.name);
        }


        Client[] clients2 = new Client[5];
        clients2[0] = new Client();
        clients2[1] = new EspecialClient();

        Client arthur = new Client();
        arthur.name = "Arthur";

        clients2[0] = arthur;

        System.out.println(arthur.name);
        System.out.println(clients2[0].name);

        arthur.name = "Fritz";

        System.out.println(arthur.name);
        System.out.println(clients2[0].name);


        int[] value = new int[10];
        //long numbers[] = (long[]) value; do not have cast

        String[] names = {"Arthur","Stephanie"};
        Object[] objects;
        objects = names;

        for (Object c : objects){
            System.out.println(c);
        }

    }
}

