package methods.leason.two;

class Moto{

    public static final int PADRAO_TOTAL_DE_MOTOS = 8;
    private static int totalMotos = PADRAO_TOTAL_DE_MOTOS;

    static int b = getMetodo();
    public static int getMetodo(){
        //return 18;
        return a;
    }
    static int a = 15;
    String marca;

    public int getTotalMotos(){
        return Moto.totalMotos;
    }

    public static int getTotalMotosStatic(){
        //marca = "Honda"  - do not has access variable not static
        //Static do not have access this.
        return Moto.totalMotos;
    }

    public void changeTotal(int a){
        totalMotos = a;
    }
}

class MotocicletaDupla extends Moto{
    //public int getTotalMotosStatic(){
    //    return 1;
    //}
    public static int getTotalMotosStatic(){
        return -50000;
    }
}

public class TestStatic {
    public static void main(String ...rsrs){
        System.out.println(Moto.b);//order invocation zero
        System.out.println(Moto.a);
        //Moto.totalMotos = 15;
        //System.out.println(Moto.totalMotos);

        Moto m = new Moto();
        //m.changeTotal(15);
        System.out.println(m.getTotalMotos());

        System.out.println(Moto.getTotalMotosStatic());

        System.out.println(MotocicletaDupla.getTotalMotosStatic());
        Moto m1 = new MotocicletaDupla();
        System.out.println(m1.getTotalMotosStatic());
    }
}


