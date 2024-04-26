/*
 * Esta classe é responsável por criar um carro da Fiat.
 */
package factorymethod2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class FiatConcreteCreator extends CarCreator {
    
    protected Car factoryMethod() {
        return new ConcreteProductPalio(); // Retorna uma instância de ConcreteProductPalio
    } 
}
