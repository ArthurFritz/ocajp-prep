package i.leason.one;

public class VariableLocal {

    public void exampleIf(){
        int x = 10;
        if(x>=10){
            int y = 50;
            System.out.println(y);
        }
        // Erro por está fora do escopo
        // System.out.println(y);
        System.out.println(x);
    }

    public void exampleFor(){
        for (int i=0, j=i; i<10 ;i++){
            j++;
            System.out.println(j);
            System.out.println(i);
        }
        //Fora do escopo
        //System.out.println(j);
        //System.out.println(i);
    }


    private void exampleParameter(String name) {
        System.out.println(name);
        exampleParameterScope();
        System.out.println(name);
    }

    private void exampleParameterScope() {
        // Não definida no escopo
        //System.out.println(name);
    }

    public static void main(String[] args){
        VariableLocal variableLocal = new VariableLocal();
        variableLocal.exampleIf();
        variableLocal.exampleFor();
        variableLocal.exampleParameter("arthur");
    }

}
