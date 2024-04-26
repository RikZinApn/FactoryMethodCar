/*
 * Esta classe é a classe cliente que demonstra o uso do padrão Factory Method.
 */
package factorymethod2;

import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Client {
    
    public static void main(String[] args) {
        
        // Criação de um criador de carros da Fiat
        CarCreator creator1 = new FiatConcreteCreator();
        creator1.buildCar();
        
        // Criação de um criador de carros da Volkswagen
        CarCreator creator2 = new VolksConcreteCreator();
        creator2.buildCar();    
    } 
}
