package decoratorPatternEx.app;

import decoratorPatternEx.system.*;

public class ClothesShopping {
    public static void main(String[] args) {

        OutfitDecorator outfitForMen =
                new OutfitDecorator(
                        new ShirtClothing(
                                new SweaterClothing(
                                        new ShoesClothing(
                                                new JeansClothing(
                                                        new CapClothing(
                                                                new Body()
                                                        )
                                                )
                                        )
                                )
                        )
                );


        OutfitDecorator outfitForWomen =
                new OutfitDecorator(
                        new DressClothing(
                                new HatClothing(
                                        new HeelsClothing(
                                                new Body()
                                        )
                                )
                        )
                );

        System.out.println("Outfit for Men: "+ outfitForMen.getPrice()+"$");
        System.out.println("Outfit for Women: "+ outfitForWomen.getPrice()+"$");

    }
}
