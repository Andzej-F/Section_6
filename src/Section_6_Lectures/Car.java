package Section_6_Lectures;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;// "model" is class' field
    private String engine;
    private String colour;

    public void setModel(String model) {// "model" is a parameter
        String validModel=model.toLowerCase();
        if(validModel.equals("carrera")||validModel.equals("legacy")){
            this.model=model;
        }else{
            this.model="Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
