/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.winkel;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Willem
 */
public class Winkel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//Products Catalogue and Basket
        FakeProducten fakeData = new FakeProducten();
        Catalogus kidsCatalogus = new Catalogus(fakeData.fakeProductDataTestArray());
        Catalogus<Product> menCatalogus = new Catalogus<>();
        Mandje mandje = new Mandje();

        Product kidsProduct33 = new Product(33, "BubbleBath", new BigDecimal("2.99"), 10);
        kidsCatalogus.addProductToCatalogue(kidsProduct33);

        Product product33 = new Product(33, "ShaveCream", new BigDecimal("4.99"), 10);
        product33.displayProductInBasket();
        menCatalogus.addProductToCatalogue(product33);

        {//test add remove
            System.out.println(kidsCatalogus.size() + " Producten in Kid's Catalogus\n");
            kidsCatalogus.removeProductFromCatalogue(kidsProduct33);
            System.out.println(kidsCatalogus.size() + " Producten in Kid's Catalogus\n");
        }

        for (Product product : fakeData.fakeProductDataTestArray()) {
            //product.displayProductInBasket();
            menCatalogus.addProductToCatalogue(product);
        };

        System.out.println(menCatalogus.size() + " Producten in Men's Catalogus\n");
        System.out.println(kidsCatalogus.size() + " Producten in Kid's Catalogus\n");

        kidsCatalogus.iterator();
        
        mandje.addProduct(product33, 1);
        mandje.addProduct(kidsProduct33, 3);
        mandje.setProductQty(product33, 2);
        
        mandje.displayMandje();
        
    }

}
