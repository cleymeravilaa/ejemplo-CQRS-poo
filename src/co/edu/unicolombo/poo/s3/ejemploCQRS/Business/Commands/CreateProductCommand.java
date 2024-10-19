
package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.Commands;

/**
 *
 * @author CLEYMER
 */
public class CreateProductCommand {
    private String name;
    private double price;

    public CreateProductCommand(String name,double price ) {
        this.name = name;
        this.price = price;
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
