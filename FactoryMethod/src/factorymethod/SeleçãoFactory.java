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
public class SeleçãoFactory implements  ComprasFactory {

    @Override
    public Compras fazerCompras(String compras) {
    
        if(compras.equals("nike")){
        return new Nike ();}
        
        else{
        
        return null;
    
    
    
    }
    
}
}
