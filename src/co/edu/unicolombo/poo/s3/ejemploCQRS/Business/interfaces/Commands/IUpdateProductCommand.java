package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Commands;

import co.edu.unicolombo.poo.s3.ejemploCQRS.Domain.Model.Product;

public interface IUpdateProductCommand {
    public void updateProduct(Product product) throws Exception;
}
