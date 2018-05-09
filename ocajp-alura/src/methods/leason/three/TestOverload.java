package methods.leason.three;

class Overloader{

    public void method2(String s){
        System.out.println("com string");
    }

    public void method2(Object s){
        System.out.println("com object");
    }

    public void method4(int a, double b){
        System.out.println("int, double");
    }
    public void method4(double a, int b){
        System.out.println("double, int");
    }

    public void method5(String a, Object b){
        System.out.println("string, object");
    }
    public void method5(Object a, String b){
        System.out.println("object, string");
    }

    public void method6(String a, String b){
        System.out.println("string, string");
    }
    public void method6(Object a, Object b){
        System.out.println("object, object");
    }

    public void method3(String a, int b){
        System.out.println("String, int");
    }
    public void method3(int a, String b){
        System.out.println("int, String");
    }

    public void method(int a){
        System.out.println("Com int");
    }
    public void method(double a){
        System.out.println("Com double");
    }
    public void method() {
        System.out.println("Sem nada");
    }

}

class TestOverload {
    public static void main(String[] augs){
        new Overloader().method6("arthur","arthur");
        new Overloader().method6(new Object() , new Object());
        new Overloader().method6("arthur", new Object());

        new Overloader().method2("guilherme");
        new Overloader().method2((Object) "guilherme");
        new Overloader().method2(new Object());

        new Overloader().method4(3,5.2);
        new Overloader().method4(5.2 , 3);
        //new Overloader().method4(4, 3); ambiguous

        //new Overloader().method5("arthur","stephanie");// ambiguous

        new Overloader().method();
        new Overloader().method(423);
        new Overloader().method(423.25);
        new Overloader().method((float) 423.25);
        new Overloader().method('Z');
        new Overloader().method((short) 423);
    }
}