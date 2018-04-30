package types.leason.three;

public class Car {
    String model;
    int year;

    public Car(){
        year = 2014;
    }

    void reset(){
        year = 2014;
    }

    public String getDataPrint(){
        return model + "::" + year;
    }

    public void setModel(String model){
        this.model = model;
    }
}
