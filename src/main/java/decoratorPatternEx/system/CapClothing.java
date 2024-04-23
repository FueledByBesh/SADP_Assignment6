package decoratorPatternEx.system;

public class CapClothing extends OutfitDecorator {

    private final double capPrice=2.60;

    public CapClothing(Wardrobe wardrobe) {
        super(wardrobe);
    }

    @Override
    public double getPrice(){
        return totalPrice+capPrice;
    }

}
