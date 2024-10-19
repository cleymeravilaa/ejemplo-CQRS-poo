
package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Queries;

import co.edu.unicolombo.poo.s3.ejemploCQRS.Domain.Model.Product;

/**
 *
 * @author CLEYMER
 */
public interface IGetProductQuery {
    public Product getProduct(int productId) throws Exception;
    public Product getProduct(String productName) throws Exception;
}
