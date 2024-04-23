package decoratorPatternEx.system;

public class HatClothing extends OutfitDecorator{

    private final double hatPrice = 3.50;

    public HatClothing(Wardrobe wardrobe) {
        super(wardrobe);
    }

    @Override
    public double getPrice(){
        return this.totalPrice+hatPrice;
    }
}
