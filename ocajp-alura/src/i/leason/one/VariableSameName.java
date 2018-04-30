package i.leason.one;

class Bla{
    static int a;
    //int a;//Error second declaration of variable (redeclaration) Variable static and menber.
    public static void setA(int a){
        Bla.a = a;
    }

    int b;
    public void setB(int b) {
        this.b = b;
    }
}

class X{
    int a = 10;
    public void method() {
        a = 20;
        System.out.println(a);
    }
}

public class VariableSameName {
    public static void main(String[] args){
        int a = 0 ;
        //int a = 10; //Error second declaration of variable (redeclaration)
        new X().method();
    }
}
