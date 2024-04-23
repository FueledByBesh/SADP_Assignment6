package decoratorPatternEx.system;

public class OutfitDecorator implements Wardrobe {

    private Wardrobe wardrobe;
    protected double totalPrice;

    public OutfitDecorator(Wardrobe wardrobe) {
        this.wardrobe=wardrobe;
        this.totalPrice+=wardrobe.getPrice();
    }

    @Override
    public double getPrice() {
        return totalPrice;
    }

//    public void addOutfit(double price){
//        this.totalPrice+=price;
//    }

}
