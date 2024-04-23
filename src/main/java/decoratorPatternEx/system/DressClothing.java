package decoratorPatternEx.system;

public class DressClothing extends OutfitDecorator{

    private final double dressPrice=12.30;

    public DressClothing(Wardrobe wardrobe) {
        super(wardrobe);
    }

    @Override
    public double getPrice(){
        return this.totalPrice+dressPrice;
    }
}
