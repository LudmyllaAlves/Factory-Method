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
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ComprasFactory fabrica = new SeleçãoFactory();
       Compras compras = fabrica.fazerCompras("nike");
       compras.exibirCompra();
        System.out.println("");
        
       fabrica = new TimesFactory();
       compras = fabrica.fazerCompras("puma");
       compras.exibirCompra();
        System.out.println("");
    
          
        fabrica = new TimesFactory();
        compras = fabrica.fazerCompras("kappa");
        compras.exibirCompra();
        System.out.println("");
    
         fabrica = new TimesFactory();
       compras = fabrica.fazerCompras("adidas");
       compras.exibirCompra();
        System.out.println("");
      
         fabrica = new TimesFactory();
        compras = fabrica.fazerCompras("umbro");
       compras.exibirCompra();
        System.out.println("");
    }
        
        
        
        
    }
    
    
       
