package FactoryMethod;

/**
 * Created by hiroto on 2015/07/20.
 */
public class EnpitsuCreator extends AbstractCreator{
    @Override
    StationaryProduct createStationary() {
        return new Enpitsu();
    }
}
