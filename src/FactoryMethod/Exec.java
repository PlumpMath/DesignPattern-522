package FactoryMethod;

/**
 * Created by hiroto on 2015/07/20.
 */
public class Exec {
    public static void main(String args[]) {
        AbstractCreator enpitsu = new EnpitsuCreator();
        AbstractCreator sharp = new SharpPencilCreator();
        StationaryProduct stationary = enpitsu.createStationary();
        stationary.setPlate("enpitsu");
        stationary.printPlate();
        stationary.write();

        StationaryProduct stationary2 = sharp.createStationary();
        stationary2.setPlate("sharp");
        stationary2.printPlate();
        stationary2.write();


    }
}
