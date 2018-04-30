package types.leason.three;

class TestCar {

    public static void main (String args[]){
        Car a = new Car();
        a.model = "Palio";
        a.setModel("Palio 2");
        System.out.println(a.getDataPrint());
        System.out.println(a.year);
        System.out.println(a.model.length());
    }

}

