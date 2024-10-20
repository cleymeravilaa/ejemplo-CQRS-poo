package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.Commands.Handlers;

import co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Commands.IDeleteProductCommand;
import co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Repositories.IProductRepository;
import co.edu.unicolombo.poo.s3.ejemploCQRS.Domain.Model.Product;

public class DeleteProductCommandHandler implements IDeleteProductCommand{
    private IProductRepository repository;

    public DeleteProductCommandHandler(IProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deleteProduct(Product product) throws Exception {
        this.repository.deleteProduct(product);
    }
    
    
}
