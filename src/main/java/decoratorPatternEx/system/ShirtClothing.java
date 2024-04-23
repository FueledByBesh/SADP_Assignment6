package decoratorPatternEx.system;

public class ShirtClothing extends OutfitDecorator{

    private final double shirtPrice = 5.10;

    public ShirtClothing(Wardrobe wardrobe) {
        super(wardrobe);
    }

    @Override
    public double getPrice(){
        return this.totalPrice+shirtPrice;
    }
}
