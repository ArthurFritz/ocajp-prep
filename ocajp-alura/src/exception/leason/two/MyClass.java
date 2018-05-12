package exception.leason.two;

public class MyClass {
    public void doSomething(int[] idades){
        //if(idades != null && idades.length>=2)

        System.out.println(idades[1]);
    }
    public static void main(String[] args) {
        new MyClass().doSomething(new int[5]);
        new MyClass().doSomething(new int[0]);
        new MyClass().doSomething(null);
    }
}
