/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.winkel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Willem
 */
public class Catalogus<Product> {
    private List<Product> producten = new ArrayList<>();
    
    public Catalogus(){
        
    }
    
    public Catalogus(Product[] producten){
        for(Product product : producten){
            addProductToCatalogue(product);
        }
    }
    
    public int size(){
        return producten.size();
    }
    
    public void addProductToCatalogue(Product product){
        producten.add(product);
    }
    
    public void removeProductFromCatalogue(Product product){
        producten.remove(product);
    }
    
    //public Iterator <Product> iterator() { return producten.iterator(); } // ??????????????????????????????
    
    public void iterator(){
        
        System.out.println("");
        System.out.println("*** Catalogue ***");
        
        //producten.iterator();
        
        for(Product product : producten){
            System.out.println(product.toString());
            //product.getClass().get ???????????????????????????????????????????????????? getPrice
        }
        
    }
}
