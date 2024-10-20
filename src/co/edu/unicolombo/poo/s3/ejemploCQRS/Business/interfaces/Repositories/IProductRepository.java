
package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Repositories;

import co.edu.unicolombo.poo.s3.ejemploCQRS.Domain.Model.Product;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public interface IProductRepository {
    public Product findProductById(int productId) throws Exception;
    public Product findProductByName(String name) throws Exception;
    public Product saveProduct(Product product) throws Exception;
    public void updateProduct(Product product) throws Exception;
    public int deleteProduct(Product product) throws Exception;
    public List<Product> getAllProducts();
}
