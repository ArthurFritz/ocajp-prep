package i.leason.one;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class Pessoa {
    static int id = 1;
    static void method(){
        System.out.println(id);
    }
}

public class VariableInstance {

    String name = "Arthur";
    String fullName = name + " Fritz";

    public VariableInstance(){
        System.out.println(name);
    }

    public void showFullName() {
        System.out.println(fullName);
    }

    public static void main(String[] args){
        examplesInstance();
        System.out.println("--------------------------------------");
        staticVariables();
    }

    private static void staticVariables() {
        Pessoa p = new Pessoa();
        System.out.println(p.id);
        System.out.println(Pessoa.id);
        Pessoa.id = 50;
        p.method();
    }

    private static void examplesInstance() {
        VariableInstance variableInstance = new VariableInstance();
        variableInstance.showFullName();
        variableInstance.name="Teste";
        System.out.println(variableInstance.name);
        variableInstance.showFullName();
    }

}
