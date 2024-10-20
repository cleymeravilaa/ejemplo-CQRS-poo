package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.Commands.Handlers;

import co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Commands.IUpdateProductCommand;
import co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Repositories.IProductRepository;
import co.edu.unicolombo.poo.s3.ejemploCQRS.Domain.Model.Product;

public class UpdateProductCommandHandler implements IUpdateProductCommand{
    private IProductRepository repository;

    public UpdateProductCommandHandler(IProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void updateProduct(Product product) throws Exception {
        this.repository.updateProduct(product);
    }

}
