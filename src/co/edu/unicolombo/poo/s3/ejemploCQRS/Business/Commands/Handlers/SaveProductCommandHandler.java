
package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.Commands.Handlers;

import co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Commands.ISaveProductCommand;
import co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Repositories.IProductRepository;
import co.edu.unicolombo.poo.s3.ejemploCQRS.Domain.Model.Product;

/**
 *
 * @author CLEYMER
 */
public class SaveProductCommandHandler implements ISaveProductCommand{
    
    private IProductRepository repository;

    public SaveProductCommandHandler(IProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product saveProduct(Product product) throws Exception {
        return this.repository.saveProduct(product);
    }
    
}
