package types.leason.five.method;

class Calculator {
    public int soma(String name, int... numbers){//varargs 0...n diference []
        int soma = 0;
        for (int i = 0; i < numbers.length; i++)
            soma+=numbers[i];
        return soma;
    }
}

public class TestCalculator {
    public static void main(String args[]){
        Calculator c = new Calculator();
        System.out.println(c.soma("Fritz",3,5));
        System.out.println(c.soma("Fritz",3,5,10));
        System.out.println(c.soma("Fritz",3,5,10,4));
        System.out.println(c.soma("Fritz",3,5,10,4,5));
        System.out.println(c.soma("Fritz",3,5,10,4,5,1,2,3,4,5));
        System.out.println(c.soma("Fritz",3));
        System.out.println(c.soma("Fritz"));
    }
}

