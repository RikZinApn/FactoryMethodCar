/*
 * Esta classe representa um carro genérico com informações como modelo, fábrica e categoria.
 */
package factorymethod2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public abstract class Car {
    
    private String model; // Modelo do carro
    private String factory; // Fábrica do carro
    private String category; // Categoria do carro
    
    /*
     * Método para exibir as informações do carro.
     */
    public void showInformation() {
        
        System.out.println("Modelo: " + this.getModel() + "\nFábrica: " + this.getFactory() + "\nCategoria: " + this.getCategory());
    }
    
    /*
     * Getters e setters para os atributos do carro.
     */
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getFactory() {
        return factory;
    }
    
    public void setFactory(String factory) {
        this.factory = factory;
    }
        
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }  
}
