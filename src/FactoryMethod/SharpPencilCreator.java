package FactoryMethod;

/**
 * Created by hiroto on 2015/07/20.
 */
public class SharpPencilCreator extends AbstractCreator{
    @Override
    StationaryProduct createStationary() {
        return new SharpPencil();
    }
}
