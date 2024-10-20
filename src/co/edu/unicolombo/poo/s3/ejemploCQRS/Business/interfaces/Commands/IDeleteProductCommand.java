package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Commands;

import co.edu.unicolombo.poo.s3.ejemploCQRS.Domain.Model.Product;

public interface IDeleteProductCommand {
    public void deleteProduct(Product product) throws Exception;
}
