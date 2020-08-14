/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jancustomerpurchase;

/**
 *
 * @author Abinet
 */
public class pizzaFactory {
    double total,pizzaPrice;
    
    public double calcPrice(int numberofPizza, double pizzaPrice, double total)
    {
        pizzaPrice = pizzaPrice/2.0;
        return numberofPizza * pizzaPrice;
        return pizzaPrice * numberofPizza;
    }

}
