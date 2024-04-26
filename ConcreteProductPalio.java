    /*
 * Esta classe representa um produto concreto (um modelo específico de carro) da Fiat.
 */
package factorymethod2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ConcreteProductPalio extends Car {

    public ConcreteProductPalio() {
        // Configuração das informações específicas do Palio da Fiat
        this.setModel("Palio");
        this.setFactory("Fiat");
        this.setCategory("Hatch");
        this.showInformation(); // Mostra as informações do carro
    }
}
