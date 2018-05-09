package methods.leason.four;

class A {
    //default
    //A(){
    //    super();
    //};

    int i  = 15;
    String name;
    int tamanho = lengthName();

    A(String name){
        printName();
        this.name = name;
        System.out.println(i);
    }

    private void printName(){
        System.out.println(name);
    }

    int lengthName(){
        //return name.length(); NPE
        return 99;
    }

}

class B extends  A {
    B(String s){
        super(s);
    }

    void printName(){
        System.out.println(name.length());
    }
}

public class TestContruct {

    public TestContruct(){

    }

    public static void main(String args[]){
        //A a = new A(); override constructor default
        A b = new A("arthur");
        System.out.println(b.name);

        B c = new B("arthur");

    }
}
