package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Queries;

import co.edu.unicolombo.poo.s3.ejemploCQRS.Domain.Model.Product;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public interface IGetAllProductsQuery {
    public List<Product> getAllProducts() throws Exception;
}
