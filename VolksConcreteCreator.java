/*
 * Esta classe é responsável por criar um carro da Volkswagen.
 */
package factorymethod2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class VolksConcreteCreator extends CarCreator {
    
    protected Car factoryMethod() {
        return new ConcreteProductGol(); // Retorna uma instância de ConcreteProductGol
    }
}
