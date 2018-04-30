//First and optional package 1..0
package basic.leason.two;

//0..n
interface A {
    int TAMANHO = 5; //default variable is public static final do not alter value
    void autentica(String name, String password); //default method is public
}

//0..n
class B implements A {
    int B;
    B(){}
    void B(){ }

    @Override
    public void autentica(String name, String password) {

    }
}

// public 0..1 but of class name same name archive
public class /* name of classe */ StructureClass {

    static int totalDePessoas = 0;

    String name;
    StructureClass(String name){
        if(name == null){
            this.name = "Arthur";
            return; //somente return vazio
        }
        this.name = name;
    }

    /**
     * Javadoc, this method return full name;
     * @return - full name
     */
    public String getName() {
        String middleName = " Fritz";
        return name + middleName;
    }

    public static void main(String[] args){
        StructureClass structureClass = new StructureClass(null);
        System.out.println(structureClass.getName());
    }
}
