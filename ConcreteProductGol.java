/*
 * Esta classe representa um produto concreto (um modelo específico de carro) da Volkswagen.
 */
package factorymethod2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ConcreteProductGol extends Car {
    
    public ConcreteProductGol() {
        // Configuração das informações específicas do Gol da Volkswagen
        this.setModel("Gol");
        this.setFactory("Volks");
        this.setCategory("Hatch");
        this.showInformation(); // Mostra as informações do carro
    }
}
