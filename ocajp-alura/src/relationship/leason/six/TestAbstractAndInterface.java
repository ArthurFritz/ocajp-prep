package relationship.leason.six;

interface A{
    int x = 10; //is default public static final;
    int X = 10; //is default public static final;
}
class ArtA implements A{

}
interface B extends A{

}
interface C extends B, Runnable{ //interface never used implements

}

abstract class NoneMethod{

}

abstract class methodAbstract{
    abstract void execute();
    void on(){

    }
    void off(){

    }
}

interface Vehicle{ //interface all methods is abstract and public default
    abstract void on();
}

abstract class Moto implements Vehicle{
}

class Car implements Vehicle, Runnable{
    public void on (){

    }
    public void run(){}
}

abstract class CarAutomatic extends Car{
    abstract public void on();
}

class CarAutomaticBeatiful extends CarAutomatic{
    public void on(){

    }
}

public class TestAbstractAndInterface {
    public static void main(String[] args) {
        //Car c = new CarAutomatic() not initialize class abstract
        Car c = new Car();
        c.on();

        Car b = new CarAutomaticBeatiful();
        b.on();
        //new NoneMethod();
        //new methodAbstract();
        //A.x = 123; not altered is final
        System.out.println(new ArtA().x);
    }
}
