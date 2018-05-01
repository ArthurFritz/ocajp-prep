package operators.leason.two;

public class TestArithmetic {
    public static void main(String[] args) {
        int two = 2;
        int ten = 10;

        //rule return, minimum int or max number involved
        int twelve = ten + two;
        int eight = ten - two;
        int twenty = ten * two;
        int five = ten / two;
        int restDivision = ten % two;

        //int division1 = ten / 0;//Error execution
        double division2 = ten / 0.0;//0.0 exist division point float
        System.out.println(division2);

        System.out.println((two+0.0) /0);

        double infinityPostive = 5.0 / 0;
        double infinityNegative = -5.0 / 0;
        System.out.println(infinityPostive + infinityNegative);

    }
}
