package relationship.leason.four;


interface Automatic{}
class Vehicle{ }
class Moto extends Vehicle{}
class Car extends  Vehicle{}
class CarAutomatic extends Car implements Automatic{}
final class Moto2 extends Vehicle{} // final - ninguém pode herdar

//TODO - verify
public class TestCasting {
    public static void main (String... args){
        CarAutomatic ca = new CarAutomatic();
        Car c2 = ca;

        boolean typeAutomatic = c2 instanceof Automatic;
        //!(c2 instanceof Automatic) - necessary parenteses
        if(c2 instanceof Automatic){
            System.out.println("is automatic!");
        }

        Automatic a = ca;
        //Automatic au = c2; Not compiled
        Automatic au = (Automatic) c2;

        Moto m2 = new Moto();
        //Automatic aut = m2; -- not compiled
        //Automatic aut = (Automatic) m2;//compiled - ClassCastException - Car cannot be cast to Automatic

        String arthur = (String) "Arthur"; //Cast not necessary
        String name = (String) arthur;//Cast not necessary
        Object name2 = (Object) arthur;//Cast not necessary

        Vehicle v = new Car();
        //Moto m = (Moto) v; ClassCastException - Car cannot be cast to Moto

        Car c = new Car();
        //Moto m2 = (Moto) c; -- Not compiled inconvertible


        Object[] objects = new Object[100];
        String s = "certificacao";
        objects[0] = s;

        String recuperada = (String) objects[0];
    }
}
