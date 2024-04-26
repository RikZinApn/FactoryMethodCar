/*
 * Esta classe é a classe base para criadores de carros.
 */
package factorymethod2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public abstract class CarCreator {
    
    /*
     * Método para construir um carro.
     */
    public void buildCar() {
        Car car = factoryMethod();
    }
    
    /*
     * Método de fábrica abstrato para criar um carro.
     */
    protected abstract Car factoryMethod();   
}
