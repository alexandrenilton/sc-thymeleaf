package education.scthymeleaf.services;

import education.scthymeleaf.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}