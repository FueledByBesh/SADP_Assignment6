package decoratorPatternEx.system;

public class SweaterClothing extends OutfitDecorator{

    private final double sweaterPrice=15.75;

    public SweaterClothing(Wardrobe wardrobe) {
        super(wardrobe);
    }

    @Override
    public double getPrice(){
        return this.totalPrice+sweaterPrice;
    }
}
