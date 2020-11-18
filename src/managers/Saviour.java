package managers;

import entity.manager.Product;

import java.util.List;

public interface Saviour {
    void saveProducts(List<Product> listProducts);
}
