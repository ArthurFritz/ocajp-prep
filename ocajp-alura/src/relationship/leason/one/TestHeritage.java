package relationship.leason.one;

// class do not final, for heritage
// default extends Object
class Mother{

}

class Daughter extends Mother{

}

class Granddaughter extends Daughter{

}

class X{
    int x;
    public void y(){
        System.out.println("Call y in object");
    }
}

class Y extends  X{

}

class W{
    public static void method(){
        System.out.println("Call method static, defined in W");
    }
}

class Z extends W{
    public static void method(){
        //super.method(); not possible in method static 'super'
        System.out.println("Call method static, defined in Z");
    }
}

class Cat{
    String colorEyes;
    public String toString(){return "[Gato " + colorEyes + "]";}
}

class TestHeritage {
    public static void main(String args[]){
        Cat c = new Cat();
        c.colorEyes = "Brow";
        System.out.println(c.toString());
        System.out.println("Estou com um: " + c);

        Y y = new Y();
        y.x = 15;
        y.y();

        W.method();
        Z.method();

        Z z = new Z();
        z.method();

        W w = new W();
        w.method();

        W f = new Z();
        f.method();
    }
}


