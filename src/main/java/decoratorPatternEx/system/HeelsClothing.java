package decoratorPatternEx.system;

public class HeelsClothing extends OutfitDecorator{

    private final double heelsPrice = 6.55;

    public HeelsClothing(Wardrobe wardrobe) {
        super(wardrobe);
    }

    @Override
    public double getPrice(){
        return this.totalPrice+heelsPrice;
    }

}
