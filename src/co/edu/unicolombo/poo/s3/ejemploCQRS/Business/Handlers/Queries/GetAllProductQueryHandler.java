package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.Handlers.Queries;

import co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Queries.IGetAllProductsQuery;
import co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Repositories.IProductRepository;
import co.edu.unicolombo.poo.s3.ejemploCQRS.Domain.Model.Product;
import java.util.List;

public class GetAllProductQueryHandler implements IGetAllProductsQuery{
    IProductRepository repository;


    public GetAllProductQueryHandler(IProductRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public List<Product> getAllProducts() throws Exception {
        return this.repository.getAllProducts();
    }
    
}
