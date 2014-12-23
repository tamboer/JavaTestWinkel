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
public class Product implements Comparable<Product> {

    private String sku = "sku000";
    private String omschrijving = "";
    private BigDecimal prijs = BigDecimal.ZERO;

    private int itemsInStock = 0;

    public Product(int sku, String omschrijving, BigDecimal prijs, int itemsInStock) {
        String skuNum = "sku" + sku;
        setSku(skuNum);
        setOmschrijving(omschrijving);
        setPrijs(prijs);
        setItemsInStock(itemsInStock);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product)) {
            return false;
        }
        Product p = (Product) o;
        return sku == p.getSku();
    }

    @Override
    public int compareTo(Product product) {
        if (!sku.equals(product.sku)) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        
        String.format ("%40s %.2f ", omschrijving, prijs); // ??????????????????????????????????????????????????
        
        return getSku() + "|" 
                + getOmschrijving() + "|"
                + getPrijs() + "|"
                + getItemsInStock();
        
    }

    public void displayProductInBasket() {
        System.out.println(
                getSku() + "\t"
                + getOmschrijving() + "\t @"
                + getPrijs() + " ("
                + getItemsInStock() + " in stock)"
        );
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        this.prijs = prijs;
    }

    public int getItemsInStock() {
        return itemsInStock;
    }

    public void setItemsInStock(int itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

}
