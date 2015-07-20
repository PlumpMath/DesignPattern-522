package FactoryMethod;

/**
 * Created by hiroto on 2015/07/20.
 */
public abstract class StationaryProduct {
    private String plate;
    public void setPlate(String plate) {
        this.plate=plate;
    }

    public void printPlate() {
        System.out.println("名前:" + plate);
    }
    public abstract void write();
}
