package operators.leason.four;

public class TestLogicalOperator{

    public static boolean metodo(String msg) {
        System.out.println(msg);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(1 == 1 & metodo("execute all primeiro"));//execute all
        System.out.println(1 == 1 | 1 > 2);//execute all
        System.out.println(1 == 1 && metodo("primeiro"));//ignore second
        System.out.println(1 != 1 && metodo("segundo"));//ignore second
        System.out.println(1 == 1 || metodo("terceiro"));//ignore second
        System.out.println(1 == 1 ^ 1 > 2);//or exclusive
        System.out.println(!(1 == 1));
    }
}
