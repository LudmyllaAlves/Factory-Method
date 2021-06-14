/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author tatia
 */
public class TimesFactory implements ComprasFactory{

    @Override
    public Compras fazerCompras(String compras) {
        
        if(compras.equals("adidas")){
        return new Adidas ();}
        
        else if(compras.equals("kappa")){
        return new Kappa();
        }
        else if(compras.equals("umbro")){
        return new Umbro();
        }
        else if(compras.equals("puma")){
        return new Puma();
        }
        
        else{
        return null;}
    
    
    
    }
    
}
