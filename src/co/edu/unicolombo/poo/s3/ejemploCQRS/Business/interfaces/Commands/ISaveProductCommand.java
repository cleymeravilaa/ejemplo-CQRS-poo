
package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Commands;

import co.edu.unicolombo.poo.s3.ejemploCQRS.Domain.Model.Product;

/**
 *
 * @author CLEYMER
 */
public interface ISaveProductCommand {
    public int create(Product product) throws Exception;
}
