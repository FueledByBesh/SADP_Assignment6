package decoratorPatternEx.system;

public class JeansClothing extends OutfitDecorator{

    private final double jeansPrice = 9.55;

    public JeansClothing(Wardrobe wardrobe) {
        super(wardrobe);
    }

    @Override
    public double getPrice(){
        return this.totalPrice+jeansPrice;
    }
}
