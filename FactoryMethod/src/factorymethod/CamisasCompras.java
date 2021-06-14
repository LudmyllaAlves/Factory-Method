package factorymethod;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatia
 */
public class CamisasCompras {
    private double valor;
    private int quantidade;
    
    public  void calculo(double valorDaCompra){
        
        if(quantidade != 0){
            valorDaCompra = quantidade * valor;
            System.out.println("O valor da compra é:" + valorDaCompra);
        }
        else{
            System.out.println("Não foi efetuada nem uma compra");;}
}
    
}
