
package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.Handlers.Queries;

import co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Queries.IGetProductQuery;
import co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Repositories.IProductRepository;
import co.edu.unicolombo.poo.s3.ejemploCQRS.Domain.Model.Product;

/**
 *
 * @author CLEYMER
 */
public class GetProductQueryHandler implements IGetProductQuery{
    private IProductRepository productRepository;
    
    public GetProductQueryHandler(IProductRepository repository){
        productRepository = repository;
    }
    
    @Override
    public Product getProduct(int productId) throws Exception{
        return productRepository.findProductById(productId);
    }
    
    @Override
    public Product getProduct(String productName) throws Exception{
        return productRepository.findProductByName(productName);
    }
    
}
