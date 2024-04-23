package decoratorPatternEx.system;

public class ShoesClothing extends OutfitDecorator{

    private final double shoesPrice = 4.30;

    public ShoesClothing(Wardrobe wardrobe) {
        super(wardrobe);
    }

    @Override
    public double getPrice(){
        return this.totalPrice+shoesPrice;
    }
}
