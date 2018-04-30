package types.leason.four;

import types.leason.three.Car;

class Cars {
    Car c1;
    Car c2;
}

public class TestCicleLife {
    public static void main (String args[]){

        Cars cars = new Cars();
        //not create object
        Car c;// 'c' reference object in memory
        //Create object "new"
        c = new Car();
        c.setModel("Ferrari");
        cars.c1 = c;//Reference inderect

        //Create new car, last object do not access,
        c = new Car();
        cars.c2 = c;//Reference inderect


        //Remove reference
        c = null;

        if( 15>10 ){
            Car c2 = new Car();
        }

        Car c3;
        for(int i = 0; i < 10; i ++){
            c3 = new Car();
        }

        //Carbage Collectior drop objects dont have access



    }
}
