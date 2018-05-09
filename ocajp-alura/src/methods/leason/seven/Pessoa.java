package methods.leason.seven;

public class Pessoa {
    //encapsulation or hidden information
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name == null) name = "";
        this.name = name;
    }

}
