
package co.edu.unicolombo.poo.s3.ejemploCQRS.Infrastructure.Repositories;

import co.edu.unicolombo.poo.s3.ejemploCQRS.Business.Exception.ExceptionProductNoFound;
import co.edu.unicolombo.poo.s3.ejemploCQRS.Business.interfaces.Repositories.IProductRepository;
import co.edu.unicolombo.poo.s3.ejemploCQRS.Domain.Model.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public class ProductRepository implements IProductRepository{
    private static List<Product> productDb;
    
    
    public ProductRepository(){
        createProductDb();
    }
    
    public int getSizeProductDb(){
        return this.productDb.size();
    }
    
    private void createProductDb(){
        if (productDb == null) {
            productDb = new ArrayList<>();
        }
    }

    // Buscar Producto por ID
    @Override
    public Product findProductById(int productId) throws Exception {
        // Verificamos si la base de datos esta vacia
        if (productDb.isEmpty()) {
            throw new Exception("Product "+ productId + " doesn't exist");
        }
        
        Product foundProduct = null;
        
        // Buscamos el producto
        for(var p : productDb){
            // verificamos si hay un producto con el id
            if (p.getIdProduct()==productId) {
                foundProduct = p;
                break;
            }
        }
        
        // Si el usuario a buscar esta vacio -> no existe
        if (foundProduct == null) {
            // Lanzamos error en tal caso
            throw new Exception("The Product "+ productId + "dones't exist");
        } 
        return foundProduct;
    }

    @Override
    public Product findProductByName(String productName) throws Exception {
        // Verificamos si la base de datos esta vacia
        if (productDb.isEmpty()) {
            throw new Exception("Product "+ productName + " doesn't exist");
        }
        
        Product foundProduct = null;
        
        // Buscamos el producto
        for(var p : productDb){
            // verificamos si hay un producto con el nombre
            if (p.getName().equalsIgnoreCase(productName)) {
                foundProduct = p;
                break;
            }
        }
        
        // Si el producto a buscar esta vacio -> no existe
        if (foundProduct == null) {
            // Lanzamos error en tal caso
            throw new Exception("The Product "+ productName + "doesn't exist");
        }
        
        return foundProduct;
    }

    @Override
    public Product saveProduct(Product product) throws Exception{
        // Verificamos que el producto no sea nulo
        if (product == null) {
            String message = "The product cannot be null";
            throw new Exception(message);
        }
        
        for(Product p : productDb){
            if (p.getName().equalsIgnoreCase(product.getName())) {
                String message = "The product "+ p.getName()+ " already exist!";
                throw new Exception(message);
            }
        }
         
        if (productDb.isEmpty()) {
            product.setIdProduct(1);
            productDb.add(product);
        } else {
            product.setIdProduct(productDb.size()+1);
            productDb.add(product);
        }
        return product;
    }

    @Override
    public void editProduct(Product product) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int deleteProduct(Product product) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Product> getProductAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
