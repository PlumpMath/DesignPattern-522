package FactoryMethod;

/**
 * Created by hiroto on 2015/07/20.
 */
public abstract class AbstractCreator {
    private String name;
    private void mark(StationaryProduct product) {
        product.setPlate(name);
    }
    public void setName() {
        this.name=name;
    }

    public StationaryProduct create() {
        StationaryProduct product = createStationary();
        mark(product);
        return product;
    }
    abstract StationaryProduct createStationary();
}
