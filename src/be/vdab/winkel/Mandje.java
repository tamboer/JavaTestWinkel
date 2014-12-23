/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.winkel;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Willem
 */
public class Mandje {

    private Map<Product, Integer> items = new HashMap<>();
    private BigDecimal som = BigDecimal.ZERO;

    public Mandje() {

    }

    public void displayMandje() {
        System.out.println("");
        System.out.println("*** Mandje ***");

        //producten.iterator();
        for (Map.Entry<Product, Integer> item : items.entrySet()) {
            //for(Entry <Product,Integer> item : items.entrySet()){//?????????????????????????????????????????????
            System.out.println(item.getKey() + " " + item.getValue());
            //product.getClass().get // ???????????????????????????????????????????????????? getPrice
            item.getKey().getPrijs();
        }

        //for(Product <Product> item : items.keySet()){ // ???????????????????????????????????
        for (Product item : items.keySet()) {
            System.out.println(item.toString());
            //product.getClass().get ???????????????????????????????????????????????????? getSom
            //setSom(item.getSom());
        }
    }

    public void addProduct(Product product, Integer qty) {
        items.put(product, qty);

        /*
         if (! mandje.containsKey(product) ) 
         mandje.put(product, aantal); 
         else
         set(product, aantal);
        
         */
    }

    public void setProductQty(Product product, Integer qty) {
        items.replace(product, qty);

        /*
         int oudeAantal = mandje.get(product);
         mandje.put(product, oudeAantal + aantal);
         */
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    public void clear() {
        //loop through basket move products back to stock
        //this.iterator();
        //new Product().setInStockItems(inStockItems);

        items.clear();
    }

    public void iterator() {
        
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public void setItems(Map<Product, Integer> items) {
        this.items = items;
    }

    public BigDecimal getSom() {
        return som;
    }

    public void setSom(BigDecimal som) {
        this.som = som;
    }

}
