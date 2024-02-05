package nl.playground.objectOrientated.carExample;

public class Car {
    private String modelName;
    private int modelYear;
    private int modelSpeed;


    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
