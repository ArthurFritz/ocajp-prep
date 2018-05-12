package relationship.leason.five;

 class Vehicle{
     double velocity;
 }

 class Car extends Vehicle{
    double velocity;
    double getVelocityCar(){
        return this.velocity;
    }
     double getVelocityVehicle(){
         return super.velocity;
     }
 }

class Mother{
    long longNumber;
    long secondNumberLong;
    Mother(){ }
    Mother(String s){
        System.out.println("mother");
    }
    Mother(int i){}
}

class Child extends Mother{
    long secondNumberLong;
    Child(int i){
        this("Number: " + i);//super or this
        longNumber = i;
        this.longNumber = i;
        super.longNumber = i;
        secondNumberLong = i;
        this.secondNumberLong = i;
        super.secondNumberLong = i;
        s = "no problem";
        System.out.println("end constructor");
    }
    String s;
    Child(String s){
        //this(423); error compilation recursive
        super(s);//is first line forever
        this.s = s;
        System.out.println(s);
    }
}


public class TestContructor {
    public static void main(String[] args) {
        //this and super not used in static;
        new Child("Arthur");
        new Child(123);

        Car c = new Car();
        c.velocity = 50;
        System.out.println("Car: " + c.getVelocityCar());
        System.out.println("Vehicle: " + c.getVelocityVehicle());

        System.out.println("---------------------------------------------");
        Car d = new Car();
        ((Vehicle) d).velocity = 50;
        System.out.println("Car: " + d.getVelocityCar());
        System.out.println("Vehicle: " + d.getVelocityVehicle());
    }
}
