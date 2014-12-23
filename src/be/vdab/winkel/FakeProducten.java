/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.winkel;

import java.math.BigDecimal;

/**
 *
 * @author Willem
 */
public class FakeProducten {
    
    
    public Product[] fakeProductDataTestArray() {

        Product[] prodArr = new Product[14];
        prodArr[0] = new Product(1,"Toothpaste", new BigDecimal("23.99"), 20);
        prodArr[1] = new Product(2,"Soap on Rope", new BigDecimal("2.55"), 20);
        prodArr[2] = new Product(3,"Shower Gel", new BigDecimal("5.49"), 20);
        prodArr[3] = new Product(4,"Shampoo", new BigDecimal("1.99"), 20);
        prodArr[4] = new Product(5,"Conditioner", new BigDecimal("7.77"), 20);
        prodArr[5] = new Product(6,"Shaving Lotion", new BigDecimal("14.39"), 20);
        prodArr[6] = new Product(7,"Shaver", new BigDecimal("5.99"), 20);
        prodArr[7] = new Product(8,"Aftershave", new BigDecimal("1.79"), 20);
        prodArr[8] = new Product(9,"Floss", new BigDecimal("1.89"), 20);
        prodArr[9] = new Product(10,"Toothbrush", new BigDecimal("6.39"), 20);
        prodArr[10] = new Product(11,"Towel", new BigDecimal("12.00"), 20);
        prodArr[11] = new Product(12,"Wash Sponge", new BigDecimal("1.00"), 20);
        prodArr[12] = new Product(13,"Nail Clipper", new BigDecimal("9.33"), 20);
        prodArr[13] = new Product(14,"Mouth Wash", new BigDecimal("8.55"), 20);
        
        return prodArr;
    }

}
