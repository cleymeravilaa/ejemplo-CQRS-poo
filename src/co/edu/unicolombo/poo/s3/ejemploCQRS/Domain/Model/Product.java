package co.edu.unicolombo.poo.s3.ejemploCQRS.Domain.Model;

/**
 *
 * @author CLEYMER
 */

public class Product {
    private int idProduct;
    private String name;
    private double price;
    private String description;

    public Product(int idProduct, String name, double price, String description) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    public int getIdProduct() {
        return idProduct;
    }
    
    public void setIdProduct(int id){
        this.idProduct = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
