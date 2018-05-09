package relationship.leason.two;

class A{
    public void method(){
        System.out.println("a");
        //this.method2(); or method2(); - infinite loop, call method object
    }
    public void method2(){
        System.out.println("method two father");
    }
}

class B extends  A {
    public void method(){
        System.out.println("b");
        super.method();
    }

    public void method2(){
        System.out.println("c");
        method();
        super.method();
    }

    public static void main(String args[]){
        new B().method2();
    }
}

interface G{
    void x();
}

class H implements G{
    public void x(){}
}

class Vehicle {
    public void on() throws java.io.IOException{
        System.out.println("The vehicle is being switched on");
    }
}

class Helicopter extends Vehicle{
    //visibility is equal or more for father, and exception is equal or minus for father, not final
    public void on() throws java.io.FileNotFoundException{
        System.out.println("The helicopter is being switched on");
    }
}

abstract class Droid extends Vehicle{
    public abstract void on();
}

class HexaDroid extends Droid{
    public void on(){
        System.out.println("hexa");
    }
}

class FabricVehicle{
    Vehicle fabric(){
        return new Vehicle();
    }
}

class FabricHexadroid extends  FabricVehicle{
    HexaDroid fabric(){
        return new HexaDroid();
    }
}

public class TestRewrite {
    static void method(Vehicle v) throws java.io.IOException{
        v.on();
    }

    public static void main(String args[]) throws java.io.IOException{
        //Helicopter h1 = new Helicopter();
        //h1.on();
        Vehicle v1 = new Helicopter();
        v1.on();

        Vehicle v2 = new FabricVehicle().fabric();
        v2.on();

        HexaDroid h1 = new FabricHexadroid().fabric();
        h1.on();

        method(new HexaDroid());
        method(new Vehicle());
        method(new Helicopter());
    }
}
