package types.leason.five.method;

public class People {

    String name;
    int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name,
                        int age){
        this.name = name;
        this.age = age;
    }

    public void imprime(){
        System.out.println(getName());
        System.out.println(this.getName());
    }



}
