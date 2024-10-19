
package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.Commands.Handlers;

import co.edu.unicolombo.poo.s3.ejemploCQRS.Business.Commands.CreateProductCommand;
import co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Repositories.IProductRepository;
import co.edu.unicolombo.poo.s3.ejemploCQRS.Domain.Model.Product;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CLEYMER
 */
public class CreateProductCommandHandler implements CommandHandler<
        CreateProductCommand, Product>{
    
    private IProductRepository repository;

    public CreateProductCommandHandler(IProductRepository repository) {
        this.repository = repository;
    }
    
    

    @Override
    public Product handle(CreateProductCommand command) {
        Product product = new Product(0, command.getName(), command.getPrice());
        
        try {
            return repository.saveProduct(product);
        } catch (Exception ex) {
            Logger.getLogger(CreateProductCommandHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
